package grpc.client.main;

import grpc.client.OnlabClient;
import grpc.impl.exception.CouldNotConnectException;

import java.io.IOException;

/**
 * Created by robin on 4/7/17.
 */
public class main {
    public static void main(String[] args) throws IOException, CouldNotConnectException, ClassNotFoundException, InterruptedException {
        OnlabClient client = new OnlabClient("localhost", 8010);
        try{
            client.addTestInstitute();
            client.getInstitutes();
        }finally {
            client.shutdown();
        }
    }
}
