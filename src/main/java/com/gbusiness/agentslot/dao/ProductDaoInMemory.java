package com.gbusiness.agentslot.dao;

import com.gbusiness.agentslot.domain.ProductModel;
import com.gbusiness.agentslot.domain.ProductTopicModel;
import com.google.inject.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Singleton
public class ProductDaoInMemory implements ProductDao {

    static private List<ProductModel> products = new ArrayList<>();

    static {
        populateData();
    }

    @Override
    public List<ProductModel> findAll() {
        return getProducts();
    }

    @Override
    public void persist(ProductModel product) {
        this.products.add(product);
    }

    public static List<ProductModel> getProducts() {
        return new ArrayList<>(products);
    }

    private static void populateData() {
        IntStream.rangeClosed(1, 10).forEach(i ->
                products.add(new ProductModel.Builder(i, String.format("Product%d", i), String.format("Product %d", i))
                        .addTopic(new ProductTopicModel(i, String.format("Topic %d", i), 1)).build()));
    }
}
