package grpc.server;

import grpc.impl.CommentServiceImpl;
import grpc.impl.SubjectServiceImpl;
import grpc.impl.UserServiceImpl;
import grpc.impl.exception.CouldNotConnectException;
import grpc.impl.InstituteServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by robin on 4/6/17.
 */
public class OnlabServer {
    private int port;
    private Server server;
    private Logger logger;

    public OnlabServer(int port) throws IOException, CouldNotConnectException, ClassNotFoundException {
        this(ServerBuilder.forPort(port), port);
        logger = Logger.getAnonymousLogger();
    }

    /**
     * Create a RouteGuide server using serverBuilder as a base and features as data.
     */
    public OnlabServer(ServerBuilder<?> serverBuilder, int port) throws CouldNotConnectException, ClassNotFoundException {
        this.port = port;
        server = serverBuilder.addService(new InstituteServiceImpl())
                .addService(new SubjectServiceImpl())
                .addService(new UserServiceImpl())
                .addService(new CommentServiceImpl())
                .build();
    }

    public void start() throws IOException {
        server.start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may has been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                OnlabServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    /**
     * Stop serving requests and shutdown resources.
     */
    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}