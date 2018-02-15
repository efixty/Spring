package com.springframework.notworking.test;

import org.springframework.stereotype.Component;

//@Component(value = "tree")
public class Tree {

    private String type;

    public Tree() {
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "a " + type;
    }

    public void grow(int meters) {
        System.out.println(type + " grown for " + meters + " meters.");
    }
}
