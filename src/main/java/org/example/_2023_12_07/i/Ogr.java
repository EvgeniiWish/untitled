package org.example._2023_12_07.i;

import java.io.Serializable;

public class Ogr extends Hero {
    public Ogr(String name, double powerLevel) {
        super(name, powerLevel);
    }

    @Override
    void walk() {
        System.out.println("1.2");
    }
}

class Elf extends Hero implements FlyAble, Serializable {

    public Elf(String name, double powerLevel) {
        super(name, powerLevel);
    }

    @Override
    void walk() {
        System.out.println("1.3");
    }

    @Override
    public void fly() {
        System.out.println("high");
    }
}

class Wizard extends Hero {

    public Wizard(String name, double powerLevel) {
        super(name, powerLevel);
    }

    @Override
    void walk() {
        System.out.println("2.3");
    }
}