package com.springframework.notworking.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

//@Component(value = "jungle")
public class Jungle {

    private Animal animal;

    private Tree tree;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public void makeNoise(String noise) {
        animal.makeNoise(noise);
    }

    public void grow(int meters) {
        tree.grow(meters);
    }

    @PostConstruct
    public void onCreate() {
        System.out.println("An empty jungle is created.");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("Jungle is destroyed.");
    }
}
