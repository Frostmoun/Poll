package com.t.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by frostmouns on 2017/12/18.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "wx_name")
    private String wxName;
    @Column(name = "wx_account")
    private String wxAccount;
    private String device;

    @OneToMany(mappedBy="buyer")
    private List<Gift> buyGifts;

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    public String getWxAccount() {
        return wxAccount;
    }

    public void setWxAccount(String wxAccount) {
        this.wxAccount = wxAccount;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public List<Gift> getBuyGifts() {
        return buyGifts;
    }

    public void setBuyGifts(List<Gift> buyGifts) {
        this.buyGifts = buyGifts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", wxName='" + wxName + '\'' +
                ", wxAccount='" + wxAccount + '\'' +
                ", device='" + device + '\'' +
                '}';
    }
}
