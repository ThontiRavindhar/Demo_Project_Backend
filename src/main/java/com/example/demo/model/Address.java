package com.example.demo.model;

import com.example.demo.annotation.Pincode;
import com.example.demo.annotation.State;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    private int id;
    private String address;
    private String city;
    @State
    private String state;
    @Pincode
    private int pincode;

    public Address() {}

    public Address(int id, String address, String city, String state, int pincode) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getpincode() {
        return pincode;
    }

    public void setpincode(int pincode) {
        this.pincode = pincode;
    }
}
