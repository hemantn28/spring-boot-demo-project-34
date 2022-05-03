package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Politician_India")
public class Politician {

    @Id
    @GeneratedValue
    int id;
    String name;
    String constituency;
    int age;

    public Politician() {
    }

    public Politician(int id, String name, String constituency, int age) {
        this.id = id;
        this.name = name;
        this.constituency = constituency;
        this.age = age;
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

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
