// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product_service.proto

package com.gbusiness.agentslot.api;

public interface GetProductsDisplayResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.gbusiness.product.api.GetProductsDisplayResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.gbusiness.product.api.Product products = 1;</code>
   *
   * <pre>
   * List of retrieved products.
   * </pre>
   */
  java.util.List<com.gbusiness.agentslot.api.Product> 
      getProductsList();
  /**
   * <code>repeated .com.gbusiness.product.api.Product products = 1;</code>
   *
   * <pre>
   * List of retrieved products.
   * </pre>
   */
  com.gbusiness.agentslot.api.Product getProducts(int index);
  /**
   * <code>repeated .com.gbusiness.product.api.Product products = 1;</code>
   *
   * <pre>
   * List of retrieved products.
   * </pre>
   */
  int getProductsCount();
  /**
   * <code>repeated .com.gbusiness.product.api.Product products = 1;</code>
   *
   * <pre>
   * List of retrieved products.
   * </pre>
   */
  java.util.List<? extends com.gbusiness.agentslot.api.ProductOrBuilder> 
      getProductsOrBuilderList();
  /**
   * <code>repeated .com.gbusiness.product.api.Product products = 1;</code>
   *
   * <pre>
   * List of retrieved products.
   * </pre>
   */
  com.gbusiness.agentslot.api.ProductOrBuilder getProductsOrBuilder(
      int index);

  /**
   * <code>repeated .com.gbusiness.product.api.ProductTopic product_topics = 2;</code>
   *
   * <pre>
   * List of retrieved product topics.
   * </pre>
   */
  java.util.List<com.gbusiness.agentslot.api.ProductTopic> 
      getProductTopicsList();
  /**
   * <code>repeated .com.gbusiness.product.api.ProductTopic product_topics = 2;</code>
   *
   * <pre>
   * List of retrieved product topics.
   * </pre>
   */
  com.gbusiness.agentslot.api.ProductTopic getProductTopics(int index);
  /**
   * <code>repeated .com.gbusiness.product.api.ProductTopic product_topics = 2;</code>
   *
   * <pre>
   * List of retrieved product topics.
   * </pre>
   */
  int getProductTopicsCount();
  /**
   * <code>repeated .com.gbusiness.product.api.ProductTopic product_topics = 2;</code>
   *
   * <pre>
   * List of retrieved product topics.
   * </pre>
   */
  java.util.List<? extends com.gbusiness.agentslot.api.ProductTopicOrBuilder> 
      getProductTopicsOrBuilderList();
  /**
   * <code>repeated .com.gbusiness.product.api.ProductTopic product_topics = 2;</code>
   *
   * <pre>
   * List of retrieved product topics.
   * </pre>
   */
  com.gbusiness.agentslot.api.ProductTopicOrBuilder getProductTopicsOrBuilder(
      int index);

  /**
   * <code>repeated .com.gbusiness.product.api.TopicCategory topic_categories = 3;</code>
   *
   * <pre>
   * List of retrieved topic's categories.
   * </pre>
   */
  java.util.List<com.gbusiness.agentslot.api.TopicCategory> 
      getTopicCategoriesList();
  /**
   * <code>repeated .com.gbusiness.product.api.TopicCategory topic_categories = 3;</code>
   *
   * <pre>
   * List of retrieved topic's categories.
   * </pre>
   */
  com.gbusiness.agentslot.api.TopicCategory getTopicCategories(int index);
  /**
   * <code>repeated .com.gbusiness.product.api.TopicCategory topic_categories = 3;</code>
   *
   * <pre>
   * List of retrieved topic's categories.
   * </pre>
   */
  int getTopicCategoriesCount();
  /**
   * <code>repeated .com.gbusiness.product.api.TopicCategory topic_categories = 3;</code>
   *
   * <pre>
   * List of retrieved topic's categories.
   * </pre>
   */
  java.util.List<? extends com.gbusiness.agentslot.api.TopicCategoryOrBuilder> 
      getTopicCategoriesOrBuilderList();
  /**
   * <code>repeated .com.gbusiness.product.api.TopicCategory topic_categories = 3;</code>
   *
   * <pre>
   * List of retrieved topic's categories.
   * </pre>
   */
  com.gbusiness.agentslot.api.TopicCategoryOrBuilder getTopicCategoriesOrBuilder(
      int index);
}
