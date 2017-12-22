package com.t.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 * Created by frostmouns on 2017/12/18.
 */
@Entity
@Table(name = "gift")
public class Gift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int count;
    @ManyToOne
    @JoinColumn(name = "giftType_id")
    @JsonBackReference
    private GiftType giftType;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    @JsonBackReference
    private Player owner;
    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private User buyer;



    public Gift() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public GiftType getGiftType() {
        return giftType;
    }

    public void setGiftType(GiftType giftType) {
        this.giftType = giftType;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}

