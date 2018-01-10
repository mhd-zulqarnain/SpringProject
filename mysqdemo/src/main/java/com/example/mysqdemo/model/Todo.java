package com.example.mysqdemo.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Zul Qarnain on 1/10/2018.
 */
@Entity
public class Todo {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "uid")
    private int uid;

    @Column(name = "des")
    private String des;

    public Todo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
