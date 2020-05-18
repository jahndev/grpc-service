package com.gbusiness.agentslot.converter;

import com.gbusiness.agentslot.api.TopicCategory;
import com.gbusiness.agentslot.domain.TopicCategoryModel;

public class CategoryConverter implements Converter<TopicCategoryModel, TopicCategory> {

    @Override
    public TopicCategory toProto(TopicCategoryModel object) {

        if (object == null) {
            return null;
        }

        TopicCategory.Builder categoryBuilder = TopicCategory.newBuilder()
                .setId(Converter.buildProtoId("category", object.getId()))
                .setDescription(object.getDescription());

        return categoryBuilder.build();
    }

    @Override
    public TopicCategoryModel fromProto(TopicCategory proto) {

        if (proto == null) {
            return null;
        }

        TopicCategoryModel model = new TopicCategoryModel(Converter.extractModelId(proto.getId()), proto.getDescription());

        return model;
    }

}
