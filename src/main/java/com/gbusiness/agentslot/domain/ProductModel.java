package com.gbusiness.agentslot.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity(name = "Product")
public class ProductModel implements Serializable {

    @Id
    private Integer id;
    private String title;
    private String description;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "ProductTopicAssign",
            joinColumns = { @JoinColumn(name = "productId") },
            inverseJoinColumns = { @JoinColumn(name = "productTopicId") }
    )
    Set<ProductTopicModel> topics = new HashSet<>();

    public ProductModel() {

    }

    public ProductModel(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.topics = new HashSet<>();
    }

    public static class Builder {
        private ProductModel instance;

        public Builder(Integer id, String title, String description) {
            this.instance = new ProductModel(id, title, description);
        }

        public Builder addTopic(ProductTopicModel topic) {
            this.instance.topics.add(topic);
            return this;
        }


        public ProductModel build() {
            return this.instance;
        }
    }

    public Set<ProductTopicModel> getTopics() {
        return topics;
    }

    public void setTopics(Set<ProductTopicModel> topics) {
        this.topics = topics;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductModel that = (ProductModel) o;
        return id.equals(that.id) &&
                description.equals(that.description);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", topics=" + topics +
                '}';
    }
}
