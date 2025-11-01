package com.example.webproject.Model;

import java.sql.Timestamp;

public class Products {
    private long id;
    private String name;
    private String description;
    private String summary;
    private String cover;
    private long categoryId;
    private Timestamp created;
    private Timestamp updated;


    public Products() {
    }

    public Products(long id, String name, String description, String summary, String cover, long categoryId, Timestamp created, Timestamp updated) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.summary = summary;
        this.cover = cover;
        this.categoryId = categoryId;
        this.created = created;
        this.updated = updated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", summary='" + summary + '\'' +
                ", cover='" + cover + '\'' +
                ", categoryId=" + categoryId +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
