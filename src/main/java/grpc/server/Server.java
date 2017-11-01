package grpc.server;

import grpc.service.CommentServiceImpl;
import grpc.service.SubjectServiceImpl;
import grpc.service.UserServiceImpl;
import grpc.dal.exception.*;
import grpc.service.InstituteServiceImpl;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by robin on 4/6/17.
 */
public class Server {
    private int port;
    private io.grpc.Server server;
    private Logger logger;

    public Server(int port) throws IOException, CouldNotConnectException, ClassNotFoundException {
        this(ServerBuilder.forPort(port), port);
        logger = Logger.getAnonymousLogger();
    }

    /**
     * Create a RouteGuide server using serverBuilder as a base and features as data.
     */
    public Server(ServerBuilder<?> serverBuilder, int port) throws CouldNotConnectException, ClassNotFoundException {
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
                Server.this.stop();
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
     * Await termination on the Publisher thread since the grpc library uses daemon threads.
     */
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}