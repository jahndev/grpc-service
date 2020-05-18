package com.gbusiness.agentslot.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "TopicCategory")
public class TopicCategoryModel implements Serializable {

    @Id
    private Integer id;
    private String description;

    public TopicCategoryModel() {

    }

    public TopicCategoryModel(Integer id, String description) {
        this.id = id;
        this.description = description;
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
        TopicCategoryModel that = (TopicCategoryModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }

    @Override
    public String toString() {
        return "ProductTopicCategoryModel{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
