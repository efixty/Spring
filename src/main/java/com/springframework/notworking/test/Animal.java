package com.springframework.notworking.test;

import org.springframework.stereotype.Component;

//@Component(value = "animal")
public class Animal {

    private String type;

    public Animal() {
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "a " + type;
    }

    public void makeNoise(String noise) {
        System.out.println(type + " yells: " + noise);
    }
}
