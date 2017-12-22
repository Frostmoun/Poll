package com.t.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by frostmouns on 2017/12/18.
 */
@Entity
@Table
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private int photo;

    @OneToMany(mappedBy = "room")
    private List<Player> userList;
    @OneToMany(mappedBy="owner")
    private List<Gift> gainGiftList;

    public Room() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public List<Gift> getGainGiftList() {
        return gainGiftList;
    }

    public void setGainGiftList(List<Gift> gainGiftList) {
        this.gainGiftList = gainGiftList;
    }

    public List<Player> getUserList() {
        return userList;
    }

    public void setUserList(List<Player> userList) {
        this.userList = userList;
    }
}
