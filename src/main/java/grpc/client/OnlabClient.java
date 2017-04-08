package grpc.client;

import grpc.generated.*;
import io.grpc.ManagedChannel;
import grpc.generated.InstituteServiceGrpc;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by robin on 4/7/17.
 */
public class OnlabClient {
    private static final Logger logger = Logger.getLogger(OnlabClient.class.getName());

    private final ManagedChannel channel;
    private final InstituteServiceGrpc.InstituteServiceBlockingStub blockingStub;
    private final InstituteServiceGrpc.InstituteServiceStub asyncStub;

    private TestHelper testHelper;

    public OnlabClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext(true));
    }
    private OnlabClient(ManagedChannelBuilder<?> channelBuilder) {
        channel = channelBuilder.build();
        blockingStub = InstituteServiceGrpc.newBlockingStub(channel);
        asyncStub = InstituteServiceGrpc.newStub(channel);
        testHelper = new TestHelper();
    }
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    public void getInstitutes() {
        info("*** printing all institutes");

        InstituteList list;
        try {
            list = blockingStub.getAllInstitutes(Empty.getDefaultInstance());
            if (testHelper != null) {
                testHelper.onMessage(list);
            }
        } catch (StatusRuntimeException e) {
            warning("RPC failed: {0}", e.getStatus());
            if (testHelper != null) {
                testHelper.onRpcError(e);
            }
        }
    }
    public void addTestInstitute(){
        info("adding institute");
        Institute.Builder builder = Institute.newBuilder();
        builder.setId(9999);
        builder.setInstituteName("TesztInstitute");
        Institute toadd = builder.build();
        try {
            blockingStub.addInstitute(toadd);
        } catch (StatusRuntimeException e) {
            warning("RPC failed: {0}", e.getStatus());
            if (testHelper != null) {
                testHelper.onRpcError(e);
            }
        }
    }
    private void info(String msg, Object... params) {
        //System.out.println(msg);
        logger.log(Level.INFO, msg, params);
    }
    private void warning(String msg, Object... params) {
        logger.log(Level.WARNING, msg, params);
    }

    private class TestHelper {
        void onMessage(InstituteList list) {
            List<Institute> toprint = list.getInstitutesList();
            for(Institute i : toprint){
                info(" id: " +i.getId() + " name: " + i.getInstituteName());
            }
        }

        void onRpcError(Throwable e) {
            e.printStackTrace();
        }
    }
}
