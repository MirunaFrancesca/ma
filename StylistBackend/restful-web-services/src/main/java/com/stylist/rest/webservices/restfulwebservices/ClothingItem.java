package com.stylist.rest.webservices.restfulwebservices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClothingItem {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String imgUrl;

    protected ClothingItem(){
    }

    public ClothingItem(String name, String imgUrl) {
        this.name = name;
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name + this.getId();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "name='" + name + this.getId() +'\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
