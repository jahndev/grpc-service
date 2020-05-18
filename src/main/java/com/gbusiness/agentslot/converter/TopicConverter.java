package com.gbusiness.agentslot.converter;

import com.gbusiness.agentslot.api.ProductTopic;
import com.gbusiness.agentslot.domain.ProductTopicModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TopicConverter implements Converter<ProductTopicModel, ProductTopic> {

    private static final Logger logger = LoggerFactory.getLogger(TopicConverter.class);


    @Override
    public ProductTopic toProto(ProductTopicModel model) {

        if (model == null) {
            return null;
        }

        ProductTopic.Builder topicCategoryBuilder =
                ProductTopic.newBuilder()
                .setId(Converter.buildProtoId("topic", model.getId()))
                .setDescription(model.getDescription())
                .setCategoryId(Converter.buildProtoId("category", model.getTopicCategoryId()));

        return topicCategoryBuilder.build();
    }

    @Override
    public ProductTopicModel fromProto(ProductTopic proto) {

        if (proto == null) {
            return null;
        }

        ProductTopicModel model = new ProductTopicModel(Converter.extractModelId(proto.getId()), proto.getDescription(), Converter.extractModelId(proto.getCategoryId()));

        return model;
    }
}