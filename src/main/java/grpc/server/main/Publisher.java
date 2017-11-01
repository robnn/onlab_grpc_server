package grpc.server.main;

import grpc.dal.exception.*;
import grpc.server.Server;

import java.io.IOException;

/**
 * Created by robin on 4/6/17.
 */
public class Publisher {
    public static void main(String[] args) throws IOException, CouldNotConnectException, ClassNotFoundException, InterruptedException {
        Server server = new Server(8010);
        server.start();
        server.blockUntilShutdown();
    }
}
