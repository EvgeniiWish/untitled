package org.example._2023_12_12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Generator.accountsGenerator(2
        )));
        Account[] accounts = Generator.accountsGenerator(2);
        System.out.println(accounts);
        System.out.println(Arrays.toString(accounts));
    }

}
