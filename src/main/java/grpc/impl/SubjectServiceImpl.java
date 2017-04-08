package grpc.impl;

import grpc.generated.*;
import grpc.impl.dal.DataAccesLayer;
import grpc.impl.dal.OnlabDal;
import grpc.impl.exception.CouldNotConnectException;
import io.grpc.stub.StreamObserver;

/**
 * Created by robin on 4/8/17.
 */
public class SubjectServiceImpl extends SubjectServiceGrpc.SubjectServiceImplBase {
    private DataAccesLayer dl = OnlabDal.getInstance();

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
