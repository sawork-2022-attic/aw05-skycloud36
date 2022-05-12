package com.micropos.carts.model;

//import javax.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "CARTS")
@Entity
public class Cart implements Serializable {

    @Id
    @GeneratedValue()
    private int id;

    private String user;

    public Cart() {}
//
//    public Cart(String user){
//        this.user = user;
//    }
//
//    public Cart(int id) {
//        this.id = id;
//    }

    public Cart(int id, String user){
        this.user = user;
        this.id = id;
    }

    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    public String getUser(){return user;}
    public void setUser(String user){this.user = user;}
}
