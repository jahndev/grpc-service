package com.gbusiness.agentslot.service;

import com.gbusiness.agentslot.api.*;
import com.gbusiness.agentslot.converter.CategoryConverter;
import com.gbusiness.agentslot.converter.ProductConverter;
import com.gbusiness.agentslot.converter.TopicConverter;
import com.gbusiness.agentslot.dao.ProductDao;
import com.gbusiness.agentslot.dao.TopicCategoryDao;
import com.gbusiness.agentslot.domain.ProductModel;
import com.gbusiness.agentslot.domain.ProductTopicModel;
import com.gbusiness.agentslot.domain.TopicCategoryModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GetProductsActionTest {

    ProductConverter productConverter;
    CategoryConverter categoryConverter;
    TopicConverter topicConverter;

    GetProductsAction getProductsAction;

    @Mock
    ProductDao productDao;

    @Mock
    TopicCategoryDao topicCategoryDao;

    @BeforeEach
    void init() {
        productConverter = new ProductConverter();
        categoryConverter = new CategoryConverter();
        topicConverter = new TopicConverter();
        getProductsAction = new GetProductsAction(productDao, topicCategoryDao, productConverter, categoryConverter, topicConverter);
    }

    @Test
    void execute_shouldReturnEmptyListWhenNoDataWasFound() {
        when(productDao.findAll()).thenReturn(Collections.emptyList());

        GetProductsDisplayResponse response = getProductsAction.execute(GetProductsDisplayRequest.newBuilder().build());

        assertEquals(0, response.getProductsCount());
    }

    @Test
    void execute_shouldReturnSameProductsQuantityFoundInData() {
        when(productDao.findAll()).thenReturn(asList(new ProductModel
                .Builder(1, "Product1", "Product 1")
                .addTopic(new ProductTopicModel(1, "Topic 1", 1))
                .build()));

        GetProductsDisplayResponse response = getProductsAction.execute(GetProductsDisplayRequest.newBuilder().build());

        assertEquals(1, response.getProductsCount());
    }

    @Test
    void execute_shouldReturnSameCategoriesQuantityFoundInData() {
        when(topicCategoryDao.findAll()).thenReturn(asList(
                new TopicCategoryModel(1, "Category 1"),
                new TopicCategoryModel(2, "Category 2")));

        GetProductsDisplayResponse response = getProductsAction.execute(GetProductsDisplayRequest.newBuilder().build());

        assertEquals(2, response.getTopicCategoriesCount());
    }

    @Test
    void execute_shouldReturnSameProductsFoundInData() {
        when(productDao.findAll()).thenReturn(asList(new ProductModel
                .Builder(1, "Product1", "Product 1")
                .addTopic(new ProductTopicModel(1, "Topic 1", 1))
                .build(), new ProductModel
                .Builder(2, "Product2", "Product 2")
                .addTopic(new ProductTopicModel(2, "Topic 2", 1))
                .build()));

        GetProductsDisplayResponse response = getProductsAction.execute(GetProductsDisplayRequest.newBuilder().build());

        Product product1 = response.getProducts(0);

        assertEquals("product/1", product1.getId());
        assertEquals("Product 1", product1.getDescription());


        Product product2 = response.getProducts(1);
;

        assertEquals("product/2", product2.getId());
        assertEquals("Product 2", product2.getDescription());
    }

    @Test
    void execute_shouldReturnSameCategoriesFoundInData() {
        when(topicCategoryDao.findAll()).thenReturn(asList(
                new TopicCategoryModel(1, "Category 1"),
                new TopicCategoryModel(2, "Category 2")));

        GetProductsDisplayResponse response = getProductsAction.execute(GetProductsDisplayRequest.newBuilder().build());

        TopicCategory category1 = response.getTopicCategories(0);

        assertEquals("category/1", category1.getId());
        assertEquals("Category 1", category1.getDescription());

        TopicCategory category2 = response.getTopicCategories(1);

        assertEquals("category/2", category2.getId());
        assertEquals("Category 2", category2.getDescription());
    }

}
