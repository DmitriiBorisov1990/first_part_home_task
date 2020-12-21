package com.epam.borisov.assignment_1.main_tasks;

import java.util.Random;
import java.util.Scanner;

public class Utility {
    private static final int BOUND = 20;

    private Utility() {
    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }

    static int randomNum() {
        Random random = new Random();
        return random.nextInt(BOUND);
    }
}
