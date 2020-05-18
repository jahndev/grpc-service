package com.gbusiness.agentslot.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "ProductTopic")
public class ProductTopicModel implements Serializable {

    @Id
    private Integer id;
    private String description;
    private Integer topicCategoryId;

    public ProductTopicModel() {

    }

    public ProductTopicModel(Integer id, String description, Integer topicCategoryId) {
        this.id = id;
        this.description = description;
        this.topicCategoryId = topicCategoryId;
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

    public Integer getTopicCategoryId() {
        return topicCategoryId;
    }

    public void setTopicCategoryId(Integer topicCategoryId) {
        this.topicCategoryId = topicCategoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductTopicModel that = (ProductTopicModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }

    @Override
    public String toString() {
        return "ProductTopicModel{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
