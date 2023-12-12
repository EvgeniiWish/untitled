package org.example._2023_12_07.i;

public abstract class Hero {
    private String name;
    private double powerLevel;

    public Hero(String name, double powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    abstract void walk();
}

interface FlyAble {
    void fly();


}