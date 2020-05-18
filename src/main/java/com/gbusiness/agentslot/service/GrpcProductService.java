package com.gbusiness.agentslot.service;

import com.gbusiness.agentslot.api.*;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;


/**
 * Protobuf service implementation
 */
public class GrpcProductService implements ProductServiceGrpc.ProductService {

    private static final Logger logger = LoggerFactory.getLogger(GrpcProductService.class);

    private GetProductsAction getProductsAction;

    @Inject
    public GrpcProductService(GetProductsAction getProductsAction) {
        this.getProductsAction = getProductsAction;
    }

    @Override
    public void getProductsDisplay(GetProductsDisplayRequest request, StreamObserver<GetProductsDisplayResponse> observer) {

        logger.info("getProductsDisplay request {}", request);

        GetProductsDisplayResponse response = getProductsAction.execute(request);

        logger.info("getProductsDisplay response {}", response);

        sendResponse(observer, response);
    }


    private <T> void sendResponse(StreamObserver<T> observerResponse, T response) {
        observerResponse.onValue(response);
        observerResponse.onCompleted();
    }
}
