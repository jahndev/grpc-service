package com.gbusiness.agentslot.converter;

import com.gbusiness.agentslot.api.TopicCategory;
import com.gbusiness.agentslot.domain.TopicCategoryModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoryConverterTest {

    CategoryConverter categoryConverter;

    @BeforeEach
    void setUp() {
        categoryConverter = new CategoryConverter();
    }

    @Test
    void toProto_shouldReturnSameCategoryAsProto() {
        TopicCategoryModel topicCategoryModel = new TopicCategoryModel(1, "Category 1");

        TopicCategory expectedCategoryProto = TopicCategory.newBuilder().setId("category/1").setDescription("Category 1").build();

        TopicCategory actualProtuctProto = categoryConverter.toProto(topicCategoryModel);

        assertEquals(expectedCategoryProto, actualProtuctProto);
    }

    @Test
    void fromProto_shouldReturnSameProtoAsModel() {
        TopicCategoryModel expectedCategoryModel = new TopicCategoryModel(1, "Category 1");

        TopicCategory expectedCategoryProto = TopicCategory.newBuilder().setId("category/1").setDescription("Category 1").build();

        TopicCategoryModel actualCategoryModel = categoryConverter.fromProto(expectedCategoryProto);

        assertEquals(expectedCategoryModel, actualCategoryModel);
    }
}
