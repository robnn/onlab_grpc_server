package grpc.service;

import grpc.generated.*;
import grpc.dal.DataAccessLayer;
import grpc.dal.DataAccessLayerImpl;
import grpc.dal.exception.*;
import io.grpc.stub.StreamObserver;

/**
 * Created by robin on 4/8/17.
 */
public class SubjectServiceImpl extends SubjectServiceGrpc.SubjectServiceImplBase {
    private DataAccessLayer dl = DataAccessLayerImpl.getInstance();

    private static final String username = "system";
    private static final String password = "oracle";

    public SubjectServiceImpl() throws CouldNotConnectException, ClassNotFoundException {
        dl.connect(username,password);
    }

    @Override
    public void getSubjectsByInstitute(Institute request, StreamObserver<SubjectList> responseObserver) {
        SubjectList subjectList = dl.getSubjectsByInstitute(request);
        responseObserver.onNext(subjectList);
        responseObserver.onCompleted();
    }

    @Override
    public void getSubjectByName(SubjectName request, StreamObserver<Subject> responseObserver) {
        Subject subject = dl.getSubjectByNameQuery(request);
        responseObserver.onNext(subject);
        responseObserver.onCompleted();
    }

    @Override
    public void addSubject(Subject request, StreamObserver<Empty> responseObserver) {
        dl.addSubjectQuery(request);
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}
