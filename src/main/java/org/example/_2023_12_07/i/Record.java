package org.example._2023_12_07.i;

public class Record {
    public static void get(Interf interf) {

    }

    public static void main(String[] args) {

        Thread thread = new Thread(new Radio());
    }
}

class Radio implements Runnable {

    @Override
    public void run() {

    }
}

interface Interf {

}