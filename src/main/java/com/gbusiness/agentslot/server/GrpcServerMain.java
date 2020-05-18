package com.gbusiness.agentslot.server;

import com.gbusiness.agentslot.GrpcServiceModule;
import com.gbusiness.agentslot.api.AgentSlotServiceGrpc;
import com.gbusiness.agentslot.api.ProductServiceGrpc;
import com.gbusiness.agentslot.service.GrpcAgentSlotService;
import com.gbusiness.agentslot.service.GrpcProductService;
import com.google.inject.Guice;
import io.grpc.ServerImpl;
import io.grpc.netty.NettyServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;

public class GrpcServerMain {

    private static final Logger logger = LoggerFactory.getLogger(GrpcServerMain.class);

    public static void main(String[] args) throws Exception {
        Guice.createInjector(new GrpcServiceModule())
            .getInstance(GrpcServerMain.class)
            .start();
    }

    private final GrpcProductService service;
    private final GrpcAgentSlotService agentSlotService;
    private final int port;
    private ServerImpl server;

    @Inject
    public GrpcServerMain(GrpcProductService service,
                          GrpcAgentSlotService agentSlotService,
                          @Named("GrpcPort") Integer port) {
        this.service = service;
        this.agentSlotService = agentSlotService;
        this.port = port;
    }

    public void start() throws Exception {
        startServer();
        logger.info("Listening on " + port);
        startShutdownHook();
    }

    public void stop() {
        if (server != null) {
            logger.info("Shutting down " + port);
            server.shutdown();
        }
    }

    private void startServer() throws IOException {
        server = NettyServerBuilder.forPort(port)
            .addService(ProductServiceGrpc.bindService(service))
            .addService(AgentSlotServiceGrpc.bindService(agentSlotService))
            .build()
            .start();
    }

    private void startShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                GrpcServerMain.this.stop();
            }
        });
    }
}
