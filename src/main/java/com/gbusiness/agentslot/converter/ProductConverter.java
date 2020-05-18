package com.gbusiness.agentslot.converter;

import com.gbusiness.agentslot.api.Product;
import com.gbusiness.agentslot.domain.ProductModel;

public class ProductConverter implements Converter<ProductModel, Product> {

    @Override
    public Product toProto(ProductModel model) {
        if (model == null) {
            return null;
        }

        Product.Builder productBuilder = Product.newBuilder()
                .setId(Converter.buildProtoId("product", model.getId()))
                .setTitle(model.getTitle())
                .setDescription(model.getDescription());

        model.getTopics().stream()
                .map(t -> Converter.buildProtoId("topic", t.getId()))
                .forEach(productBuilder::addTopicIds);

        return productBuilder.build();
    }

    @Override
    public ProductModel fromProto(Product proto) {
        if (proto == null) {
            return null;
        }

        ProductModel.Builder productModelBuilder =
                new ProductModel.Builder(Converter.extractModelId(proto.getId()), proto.getTitle(), proto.getDescription());

        return productModelBuilder.build();
    }

}
