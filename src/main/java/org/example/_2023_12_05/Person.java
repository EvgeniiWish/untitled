package org.example._2023_12_05;

import java.util.HashMap;

public class Person {
    String name;
    int age;
    static double temperatureC = 36.6;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void get() {

    }

    public static void set() {

    }

    public static void main(String[] args) {
        Person p1 = new Person("P1", 22);
        Person p2 = new Person("P2", 33);

        System.out.println(p1.age);
        Person.temperatureC = 37.0;

        String s = "!!";


    }
}