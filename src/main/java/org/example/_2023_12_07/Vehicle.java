package org.example._2023_12_07;

import org.example._2023_12_05.Calc;

public abstract class Vehicle {
    private byte wheelsNumber;
    private String color;

    public abstract void move();
}

class Mikhail extends Vehicle {



    @Override
    public void move() {
        System.out.println("2000");
    }

    public void movwe() {
        System.out.println("2000");
    }
}

class Valery extends Vehicle {

    @Override
    public void move() {
        System.out.println("1900");
    }
}