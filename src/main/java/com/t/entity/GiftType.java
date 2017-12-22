package com.t.entity;

import javax.persistence.*;

/**
 * Created by frostmouns on 2017/12/18.
 */
@Entity
@Table(name = "gift_type")
public class GiftType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int photo;
    private double price;

    public GiftType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "GiftType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo=" + photo +
                ", price=" + price +
                '}';
    }
}
