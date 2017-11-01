package grpc.service;

import grpc.generated.*;
import grpc.dal.DataAccessLayer;
import grpc.dal.DataAccessLayerImpl;
import grpc.dal.exception.*;
import io.grpc.stub.StreamObserver;

/**
 * Created by robin on 4/8/17.
 */
public class CommentServiceImpl extends CommentServiceGrpc.CommentServiceImplBase{
    private DataAccessLayer dl = DataAccessLayerImpl.getInstance();

    private static final String username = "system";
    private static final String password = "oracle";

    public CommentServiceImpl() throws CouldNotConnectException, ClassNotFoundException {
        dl.connect(username,password);
    }

    @Override
    public void getCommentsBySubject(Subject request, StreamObserver<CommentList> responseObserver) {
        CommentList commentList = dl.getCommentsBySubjectQuery(request);
        responseObserver.onNext(commentList);
        responseObserver.onCompleted();
    }

    @Override
    public void addComment(Comment request, StreamObserver<Empty> responseObserver) {
        dl.addCommentQuery(request);
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}
