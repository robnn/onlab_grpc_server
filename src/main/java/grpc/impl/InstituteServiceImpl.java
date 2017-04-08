package grpc.impl;

import grpc.generated.Empty;
import grpc.generated.Institute;
import grpc.generated.InstituteId;
import grpc.generated.InstituteList;
import grpc.generated.InstituteServiceGrpc;
import grpc.impl.dal.DataAccesLayer;
import grpc.impl.dal.OnlabDal;
import grpc.impl.exception.CouldNotConnectException;
import io.grpc.stub.StreamObserver;

/**
 * Created by robin on 4/6/17.
 */
public class InstituteServiceImpl extends InstituteServiceGrpc.InstituteServiceImplBase {
    private DataAccesLayer dl = OnlabDal.getInstance();

    private static final String username = "system";
    private static final String password = "oracle";
    public InstituteServiceImpl() throws CouldNotConnectException, ClassNotFoundException {
        dl.connect(username,password);
    }

    @Override
    public void getInstitutebyId(InstituteId request, StreamObserver<Institute> responseObserver) {
        Institute i =dl.byIdQuery(request);
        responseObserver.onNext(i);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllInstitutes(Empty request, StreamObserver<InstituteList> responseObserver) {
        responseObserver.onNext(dl.allInstituteQuery());
        responseObserver.onCompleted();
    }

    @Override
    public void addInstitute(Institute request, StreamObserver<Empty> responseObserver) {
        dl.addInstituteQuery(request);
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}
