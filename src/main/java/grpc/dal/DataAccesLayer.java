package grpc.dal;

import grpc.generated.*;
import grpc.impl.exception.CouldNotConnectException;

/**
 * Created by robin on 4/6/17.
 */
public interface DataAccesLayer {
    //institute
    void connect(String username, String password) throws CouldNotConnectException, ClassNotFoundException;
    InstituteList allInstituteQuery();
    Institute byIdQuery(InstituteId id);
    void addInstituteQuery(Institute institute);

    //user
    boolean validateUser(User u);
    User registerQuery(User u);
    UserName getNameByIdQuery(UserId uId);
    UserId getIdByNameQuery(UserName uName);
    InstituteId getInstituteIdByNameQuery(UserName uName);

    //comments
    CommentList getCommentsBySubjectQuery(Subject s);
    void addCommentQuery(Comment c);

    //subjects
    SubjectList getSubjectsByInstitute(Institute i);
    Subject getSubjectByNameQuery(SubjectName subjectName);
    void addSubjectQuery(Subject subject);
}
