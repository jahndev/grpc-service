package com.gbusiness.agentslot.service;

import com.gbusiness.agentslot.api.*;
import com.gbusiness.agentslot.converter.ProductConverter;
import com.gbusiness.agentslot.domain.ProductModel;
import com.gbusiness.agentslot.domain.ProductTopicModel;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GrpcProductServiceTest {

    ProductConverter productConverter;

    @Mock
    GetProductsAction getProductsAction;

    GrpcProductService grpcProductService;

    @BeforeEach
    void init() {
        grpcProductService = new GrpcProductService(getProductsAction);
        productConverter = new ProductConverter();
    }

    @Test
    void getProducts_shouldCallGetProductsActionOnceWithSameParameters() {
        when(getProductsAction.execute(GetProductsDisplayRequest.newBuilder().build())).thenReturn(GetProductsDisplayResponse.newBuilder().build());

        grpcProductService.getProductsDisplay(GetProductsDisplayRequest.newBuilder().build(), mock(StreamObserver.class));

        verify(getProductsAction, times(1)).execute(GetProductsDisplayRequest.newBuilder().build());
    }

    @Test
    void getProducts_shouldReturnSameProductsThatAction() {
        when(getProductsAction.execute(GetProductsDisplayRequest.newBuilder()
                .build())).thenReturn(GetProductsDisplayResponse.newBuilder()
                .addProducts(productConverter.toProto(new ProductModel
                        .Builder(1, "Product1","Product 1")
                        .addTopic(new ProductTopicModel(1, "Topic 1",1))
                        .build()))
                .addProducts(productConverter.toProto(new ProductModel
                        .Builder(2, "Product2","Product 2")
                        .addTopic(new ProductTopicModel(2, "Topic 2",1))
                        .build())).build());

        StreamObserver<GetProductsDisplayResponse> getProductsResponseStreamObserver = mock(StreamObserver.class);

        GetProductsDisplayResponse getProductsResponse = GetProductsDisplayResponse.newBuilder()
                .addProducts(productConverter.toProto(new ProductModel
                        .Builder(1, "Product1","Product 1")
                        .addTopic(new ProductTopicModel(1, "Topic 1",1))
                        .build()))
                .addProducts(productConverter.toProto(new ProductModel
                        .Builder(2, "Product2","Product 2")
                        .addTopic(new ProductTopicModel(2, "Topic 2",1))
                        .build())).build();

        grpcProductService.getProductsDisplay(GetProductsDisplayRequest.newBuilder().build(), getProductsResponseStreamObserver);

        verify(getProductsResponseStreamObserver, times(1)).onValue(getProductsResponse);
    }

    @Test
    void getProducts_shouldReturnSameCategoriesThatAction() {
        when(getProductsAction.execute(GetProductsDisplayRequest.newBuilder()
                .build())).thenReturn(GetProductsDisplayResponse.newBuilder()
                .build());

        StreamObserver<GetProductsDisplayResponse> getProductsResponseStreamObserver = mock(StreamObserver.class);

        GetProductsDisplayResponse getProductsResponse = GetProductsDisplayResponse.newBuilder().build();

        grpcProductService.getProductsDisplay(GetProductsDisplayRequest.newBuilder().build(), getProductsResponseStreamObserver);

        verify(getProductsResponseStreamObserver, times(1)).onValue(getProductsResponse);
    }




}
