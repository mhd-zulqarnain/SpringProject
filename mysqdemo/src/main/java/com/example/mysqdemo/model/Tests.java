package com.example.mysqdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zulup on 1/19/2018.
 */
@Entity
public class Tests {
    @Id
    @GeneratedValue
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;

    public Tests() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
