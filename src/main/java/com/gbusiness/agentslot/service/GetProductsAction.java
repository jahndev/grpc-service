package com.gbusiness.agentslot.service;

import com.gbusiness.agentslot.api.*;
import com.gbusiness.agentslot.converter.CategoryConverter;
import com.gbusiness.agentslot.converter.ProductConverter;
import com.gbusiness.agentslot.converter.TopicConverter;
import com.gbusiness.agentslot.dao.ProductDao;
import com.gbusiness.agentslot.dao.TopicCategoryDao;
import com.gbusiness.agentslot.domain.ProductModel;
import com.google.inject.Inject;

import java.util.List;

public class GetProductsAction implements Action<GetProductsDisplayRequest, GetProductsDisplayResponse> {

    private ProductConverter productConverter;
    private CategoryConverter categoryConverter;
    private TopicConverter topicConverter;

    private ProductDao productDao;
    private TopicCategoryDao topicCategoryDao;

    @Inject
    public GetProductsAction(
            ProductDao productDao,
            TopicCategoryDao topicCategoryDao,
            ProductConverter productConverter,
            CategoryConverter categoryConverter,
            TopicConverter topicConverter) {
        this.productDao = productDao;
        this.topicCategoryDao = topicCategoryDao;
        this.productConverter = productConverter;
        this.categoryConverter = categoryConverter;
        this.topicConverter = topicConverter;
    }

    @Override
    public GetProductsDisplayResponse execute(GetProductsDisplayRequest request) {

        final GetProductsDisplayResponse.Builder responseBuilder = GetProductsDisplayResponse.newBuilder();

        List<ProductModel> productModelList = productDao.findAll();

        productModelList.forEach(product ->
                responseBuilder.addProducts(productConverter.toProto(product))
        );

        productModelList.stream().flatMap(product -> product.getTopics().stream()).forEach(topic ->
                responseBuilder.addProductTopics(topicConverter.toProto(topic))
        );

        topicCategoryDao.findAll().forEach(topic ->
                responseBuilder.addTopicCategories(categoryConverter.toProto(topic))
        );

        return responseBuilder.build();
    }
}
