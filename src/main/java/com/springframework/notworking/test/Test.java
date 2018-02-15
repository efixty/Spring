package com.springframework.notworking.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ResourceBundle;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans.xml");

        ResourceBundle resourceBundle = ResourceBundle.getBundle("properties/jdbc");
        Jungle jungle = (Jungle) context.getBean("jungle");

        jungle.getAnimal().setType("Yeti");
        jungle.getTree().setType("Palm");

        jungle.makeNoise("Grrrr");
        jungle.grow(45);

//        Person person = (Person) context.getBean("person");
//
//        person.speak();
//
//        System.out.println(person);

        ((ClassPathXmlApplicationContext) context).close();

    }

}
