package grpc.server.main;

import grpc.impl.exception.CouldNotConnectException;
import grpc.server.OnlabServer;

import java.io.IOException;

/**
 * Created by robin on 4/6/17.
 */
public class main {
    public static void main(String[] args) throws IOException, CouldNotConnectException, ClassNotFoundException, InterruptedException {
        OnlabServer server = new OnlabServer(8010);
        server.start();
        server.blockUntilShutdown();
    }
}
