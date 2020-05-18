package com.gbusiness.agentslot.converter;

import com.gbusiness.agentslot.api.Product;
import com.gbusiness.agentslot.domain.ProductModel;
import com.gbusiness.agentslot.domain.ProductTopicModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class ProductConverterTest {

    ProductConverter productConverter;

    @BeforeEach
    void setUp() {
        productConverter = new ProductConverter();
    }

    @Test
    void toProto_shouldReturnSameProductAsProto() {
        ProductModel productModel = new ProductModel
                .Builder(1, "Product1","Product 1")
                .addTopic(new ProductTopicModel(1, "Topic 1", 1))
                .addTopic(new ProductTopicModel(2, "Topic 2", 1))
                .build();

        Product expectedProductProto =
                Product.newBuilder()
                        .setId("product/1")
                        .setDescription("Product 1")
                        .setTitle("Product1")
                        .addTopicIds("topic/1")
                        .addTopicIds("topic/2")
                        .build();

        Product actualProtuctProto = productConverter.toProto(productModel);

        assertEquals(expectedProductProto, actualProtuctProto);
    }

    @Test
    void fromProto_shouldReturnSameModelAsProto() {
        ProductModel expectedProductModel = new ProductModel
                .Builder(1, "Product1","Product 1")
                .addTopic(new ProductTopicModel(1, "Topic 1", 1))
                .build();

        Product productProto =
                Product.newBuilder()
                        .setId("product/1")
                        .setDescription("Product 1")
                        .setTitle("Product1").build();

        ProductModel actualProtuctModel = productConverter.fromProto(productProto);

        assertEquals(expectedProductModel, actualProtuctModel);
    }

    @Test
    void convert_shouldReturnNullWhenReceivesNull() {
        assertNull(productConverter.toProto(null));
    }

}
