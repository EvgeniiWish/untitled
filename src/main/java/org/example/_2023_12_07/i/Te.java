package org.example._2023_12_07.i;

public class Te implements Startable {
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}

class Programmer implements Startable, Endable{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m5() {

    }
}
interface Startable {
    void m1();
    void m2();
}

interface Endable {
    void m3();
    void m4();
    void m5();
}
