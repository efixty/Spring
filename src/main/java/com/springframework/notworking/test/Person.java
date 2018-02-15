package com.springframework.notworking.test;

public class Person {

    private int id;
    private String name;

    private int age;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void speak() {
        System.out.println("In speak() method;");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }

    private void onCreate() {
        System.out.println(name + " is created");
    }

    public void init() {
        System.out.println("ininit");
    }
}
