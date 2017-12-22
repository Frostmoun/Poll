package com.t.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by frostmouns on 2017/12/18.
 */
@MappedSuperclass
public abstract class BaseModel implements Serializable {
    private static final long serialVersionUID = 56456444556454L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseModel)) return false;

        BaseModel baseModel = (BaseModel) o;

        return getId() != null ? getId().equals(baseModel.getId()) : baseModel.getId() == null;

    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
