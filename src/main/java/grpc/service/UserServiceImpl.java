package grpc.service;

import grpc.generated.*;
import grpc.generated.Boolean;
import grpc.dal.DataAccessLayer;
import grpc.dal.DataAccessLayerImpl;
import grpc.dal.exception.*;
import io.grpc.stub.StreamObserver;

/**
 * Created by robin on 4/8/17.
 */
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    private DataAccessLayer dl = DataAccessLayerImpl.getInstance();

    private static final String username = "system";
    private static final String password = "oracle";

    public UserServiceImpl() throws CouldNotConnectException, ClassNotFoundException {
        dl.connect(username,password);
    }

    @Override
    public void validate(User request, StreamObserver<Boolean> responseObserver) {
        Boolean.Builder isValid = Boolean.newBuilder();
        isValid.setValid(dl.validateUser(request));
        responseObserver.onNext(isValid.build());
        responseObserver.onCompleted();
;
    }

    @Override
    public void register(User request, StreamObserver<User> responseObserver) {
        User u = dl.registerQuery(request);
        responseObserver.onNext(u);
        responseObserver.onCompleted();
    }

    @Override
    public void getNameById(UserId request, StreamObserver<UserName> responseObserver) {
        UserName userName = dl.getNameByIdQuery(request);
        responseObserver.onNext(userName);
        responseObserver.onCompleted();
    }

    @Override
    public void getIdByName(UserName request, StreamObserver<UserId> responseObserver) {
        UserId id = dl.getIdByNameQuery(request);
        responseObserver.onNext(id);
        responseObserver.onCompleted();
    }

    @Override
    public void getInstituteIdByName(UserName request, StreamObserver<InstituteId> responseObserver) {
        InstituteId id = dl.getInstituteIdByNameQuery(request);
        responseObserver.onNext(id);
        responseObserver.onCompleted();
    }
}
