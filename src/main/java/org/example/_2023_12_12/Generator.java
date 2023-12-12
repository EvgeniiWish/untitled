package org.example._2023_12_12;

import com.github.javafaker.Faker;

import java.math.BigDecimal;
import java.util.Random;

public class Generator {
    private static final Random RANDOM = new Random();

    public static Account[] accountsGenerator(int countAccount) {
        Account[] accounts = new Account[countAccount];
        for (int i = 0; i < countAccount; i++) {
            accounts[i] = new Account(accountNumber(),randomCountryGen(),randomCurrencyGen(),isDebitRandomGen(),generateRandomBalance());
        }
        return accounts;
    }

    public static String accountNumber() {
        return String.valueOf(Faker.instance().number());
    }

    private static Country randomCountryGen() {
        Country[] countries = Country.values();
        int i = RANDOM.nextInt(3);
        return countries[i];

    }

    private static Citezenship randomCitezenshipGen() {
        Citezenship[] citezenships = Citezenship.values();
        int i = RANDOM.nextInt(3);
        return citezenships[i];

    }

    private static Currency randomCurrencyGen() {
        Currency[] currencies = Currency.values();
        int i = RANDOM.nextInt(3);
        return currencies[i];

    }

    private static boolean isDebitRandomGen() {
        boolean[] isDebit = {
                true, false
        };
        int i = RANDOM.nextInt(2);
        return isDebit[i];
    }

    private static BigDecimal generateRandomBalance() {
        long randomBalance = RANDOM.nextLong();
         return BigDecimal.valueOf(randomBalance);
    }
}
