package com.t.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by frostmouns on 2017/12/18.
 */
@Entity
@Table(name = "palyer")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private String nickname;
    private String slogan;
    private String phone;
    private int photo;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @OneToMany(mappedBy="owner")
    private List<Gift> gainGifts;


    public Player() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Gift> getGainGifts() {
        return gainGifts;
    }

    public void setGainGifts(List<Gift> gainGifts) {
        this.gainGifts = gainGifts;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", nickname='" + nickname + '\'' +
                ", slogan='" + slogan + '\'' +
                ", phone='" + phone + '\'' +
                ", photo=" + photo +
                ", user=" + user +
                ", room=" + room +
                '}';
    }
}
