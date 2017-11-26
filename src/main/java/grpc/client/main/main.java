package grpc.client.main;

import com.google.common.base.Stopwatch;
import grpc.client.OnlabClient;
import grpc.dal.exception.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by robin on 4/7/17.
 */
public class main {
    public static void main(String[] args) throws IOException, CouldNotConnectException, ClassNotFoundException, InterruptedException {
        OnlabClient client = new OnlabClient("localhost", 8010);

        try{
//            client.addTestInstitute();
            client.getInstitutes();
            OnlabClient.getInstituesInThread();
        }finally {
            client.shutdown();

        }
    }
}
