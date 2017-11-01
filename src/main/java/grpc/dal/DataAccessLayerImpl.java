package grpc.dal;

import grpc.generated.*;
import grpc.dal.exception.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by robin on 4/6/17.
 */
public class DataAccessLayerImpl implements DataAccessLayer {

    private static DataAccessLayerImpl instance = null;
    private Connection connection;
    private static final String driverName = "oracle.jdbc.driver.OracleDriver";
    private static final String databaseUrl = "jdbc:oracle:thin:@192.168.0.104:1521:xe";

    private void checkConnected() throws NotConnectedException {
        if (connection == null) {
            throw new NotConnectedException();
        }
    }

    public static DataAccessLayerImpl getInstance() {
        if(instance==null){
            instance = new DataAccessLayerImpl();
        }
        return  instance;
    }

    @Override
    public void connect(String username, String password) throws CouldNotConnectException, ClassNotFoundException {
        try {
            if (connection == null || !connection.isValid(30)) {
                if (connection == null) {
                    // Load the specified database driver
                    Class.forName(driverName);
                } else {
                    connection.close();
                }
                // Create new connection and get metadata
                connection = DriverManager.getConnection(databaseUrl, username, password);
            }
        } catch (SQLException e) {
            throw new CouldNotConnectException();
        }
    }

    @Override
    public boolean validateUser(User u) {
        try {
            String query = "SELECT count(*) as Count FROM USER_TABLE " +
        "WHERE user_name = ? and password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,u.getUserName());
            preparedStatement.setString(2, u.getPassword());
            ResultSet rset = preparedStatement.executeQuery();
            rset.next();
            Long value = rset.getLong("Count");
            if(value == 1)
                return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public InstituteList allInstituteQuery() {

        InstituteList instituteList = InstituteList.getDefaultInstance();
        List<Institute> result = new ArrayList<>();
        try {
            checkConnected();
            try (Statement stmt = connection.createStatement()) {
                try (ResultSet rset = stmt.executeQuery("SELECT institute_id, name FROM INSTITUTE ")) {
                    while (rset.next()) {
                        Institute.Builder j = Institute.newBuilder();
                        j.setId(rset.getLong("institute_id"));
                        j.setInstituteName(rset.getString("name"));
                        Institute i = j.build();
                        result.add(i);
                    }
                }
                //instituteList.toBuilder().
            } catch (SQLException e) {
                e.printStackTrace();
            }
            InstituteList.Builder listBuilder = InstituteList.newBuilder();
            listBuilder.addAllInstitutes(result);
            instituteList = listBuilder.build();
        } catch (NotConnectedException e) {
            e.printStackTrace();
        }
        return instituteList;
    }

    @Override
    public Institute byIdQuery(InstituteId id) {
        Institute institute = Institute.getDefaultInstance();
        try {
            String query = "SELECT institute_id, name FROM INSTITUTE "
                    + "WHERE institute_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id.getId());
            ResultSet rset = preparedStatement.executeQuery();
            rset.next();
            Institute.Builder builder = Institute.newBuilder();
            builder.setId(rset.getLong("institute_id"));
            builder.setInstituteName(rset.getString("name"));
            institute = builder.build();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return institute;
    }

    @Override
    public void addInstituteQuery(Institute institute) {
        try {
            String query = "INSERT into INSTITUTE (name) VALUES"
                    + "(?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, institute.getInstituteName());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User registerQuery(User u) {
        User toreturn = User.getDefaultInstance();
        try {
            String idQuery = "SELECT MAX(USER_ID) AS MAXID FROM USER_TABLE";
            PreparedStatement idstatement = connection.prepareStatement(idQuery);
            ResultSet resultSet = idstatement.executeQuery();
            resultSet.next();
            long id = resultSet.getLong("MAXID") +1;
            String query = "INSERT into USER_TABLE (user_id, user_name, real_name, institute_id, password, role) VALUES"
                    + "(?,?,?,?,?, 'ROLE_USER')";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setLong(1,id);
            preparedStatement.setString(2, u.getUserName());
            preparedStatement.setString(3, u.getRealName());
            preparedStatement.setLong(4, u.getInstituteId());
            preparedStatement.setString(5, u.getPassword());
            preparedStatement.executeUpdate();
            toreturn = u.toBuilder().setId(id).build();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return toreturn;
    }

    @Override
    public UserName getNameByIdQuery(UserId uId) {
        UserName toReturn = UserName.getDefaultInstance();
        try {
            String query = "SELECT user_name FROM USER_TABLE "
                    + "WHERE user_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, uId.getId());
            ResultSet rset = preparedStatement.executeQuery();
            rset.next();
            UserName.Builder builder = UserName.newBuilder();
            builder.setName(rset.getString("user_name"));
            toReturn = builder.build();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    @Override
    public UserId getIdByNameQuery(UserName uName) {
        UserId toReturn = UserId.getDefaultInstance();
        try {
            String query = "SELECT user_id FROM USER_TABLE "
                    + "WHERE user_name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, uName.getName());
            ResultSet rset = preparedStatement.executeQuery();
            rset.next();
            UserId.Builder builder = UserId.newBuilder();
            builder.setId(rset.getLong("user_id"));
            toReturn = builder.build();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    @Override
    public InstituteId getInstituteIdByNameQuery(UserName uName) {
        InstituteId toReturn = InstituteId.getDefaultInstance();
        try {
            String query = "SELECT institute_id FROM USER_TABLE "
                    + "WHERE user_name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, uName.getName());
            ResultSet rset = preparedStatement.executeQuery();
            rset.next();
            InstituteId.Builder builder = InstituteId.newBuilder();
            builder.setId(rset.getLong("institute_id"));
            toReturn = builder.build();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    @Override
    public CommentList getCommentsBySubjectQuery(Subject s) {
        CommentList toReturn;
        List<Comment> result = new ArrayList<>();
        try {
            String query = "SELECT comment_id, user_id, subject_id, comment_text FROM SUBJECT_COMMENT "
                    + "WHERE subject_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, s.getId());
            ResultSet rset = preparedStatement.executeQuery();
            while (rset.next()) {
                Comment.Builder j = Comment.newBuilder();
                j.setId(rset.getLong("comment_id"));
                j.setUserId(rset.getLong("user_id"));
                j.setSubjectId(rset.getLong("subject_id"));
                j.setCommentText(rset.getString("comment_text"));
                Comment i = j.build();
                result.add(i);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        toReturn = CommentList.newBuilder().addAllComments(result).build();
        return toReturn;
    }

    @Override
    public void addCommentQuery(Comment c) {
        try {
            String idQuery = "SELECT MAX(COMMENT_ID) AS MAXID FROM SUBJECT_COMMENT";
            PreparedStatement idstatement = connection.prepareStatement(idQuery);
            ResultSet resultSet = idstatement.executeQuery();
            resultSet.next();
            long id = resultSet.getLong("MAXID") +1;
            String query = "INSERT INTO SUBJECT_COMMENT (comment_id, user_id, subject_id, comment_text) VALUES" +
                    "(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1,id);
            preparedStatement.setLong(2, c.getUserId());
            preparedStatement.setLong(3, c.getSubjectId());
            preparedStatement.setString(4, c.getCommentText());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public SubjectList getSubjectsByInstitute(Institute i) {
        SubjectList toReturn;
        List<Subject> result = new ArrayList<>();
        try {
            String query = "SELECT  subject_id, name, semester, institute_id FROM SUBJECT "
                    + "WHERE institute_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, i.getId());
            ResultSet rset = preparedStatement.executeQuery();
            while (rset.next()) {
                Subject.Builder j = Subject.newBuilder();
                j.setId(rset.getLong("subject_id"));
                j.setName(rset.getString("name"));
                j.setSemester(rset.getInt("semester"));
                j.setInstituteId(rset.getLong("institute_id"));
                Subject s = j.build();
                result.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        toReturn = SubjectList.newBuilder().addAllSubjects(result).build();
        return toReturn;
    }

    @Override
    public Subject getSubjectByNameQuery(SubjectName subjectName) {
        Subject toReturn = Subject.getDefaultInstance();
        try {
            String query = "SELECT * FROM SUBJECT " +
                    "WHERE name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, subjectName.getName());
            ResultSet rset = preparedStatement.executeQuery();
            rset.next();
            Subject.Builder builder = Subject.newBuilder();
            builder.setName(rset.getString("name"));
            builder.setInstituteId(rset.getLong("institute_id"));
            builder.setSemester(rset.getInt("semester"));
            builder.setId(rset.getLong("subject_id"));
            toReturn = builder.build();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    @Override
    public void addSubjectQuery(Subject subject) {
        try {
            String idQuery = "SELECT MAX(SUBJECT_ID) AS MAXID FROM SUBJECT";
            PreparedStatement idstatement = connection.prepareStatement(idQuery);
            ResultSet resultSet = idstatement.executeQuery();
            resultSet.next();
            long id = resultSet.getLong("MAXID") +1;
            String query = "INSERT INTO SUBJECT (subject_id, name, semester, institute_id)" +
                    "VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1,id);
            preparedStatement.setString(2, subject.getName());
            preparedStatement.setInt(3, subject.getSemester());
            preparedStatement.setLong(4, subject.getInstituteId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
