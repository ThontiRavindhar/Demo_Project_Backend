package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @Column( name = "Customer_Id" )
    private int id;
    @Column( name = "Customer_Name" )
    @NotEmpty( message = "Please provide customer name" )
    private String name;

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

    @Override
    public String toString() {
        return "Customer Entity Id: " + id + ", name: " + name;
    }

}
