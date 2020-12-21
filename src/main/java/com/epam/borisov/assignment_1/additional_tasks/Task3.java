package com.epam.borisov.assignment_1.additional_tasks;

import com.epam.borisov.assignment_1.main_tasks.Utility;

public class Task3 {
    /**
     * Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
     */
    public static void main(String[] args) {
        System.out.println("Enter the nums : ");
        String numsString = Utility.scanner();
        differentNumbersOnly(numsString);
    }

    static void differentNumbersOnly(String numbers) {
        String arrayString[] = numbers.split(" ");
        for (int i = 0; i < arrayString.length; i++) {
            char chars[] = arrayString[i].toCharArray();
            while (valueWithDifferentDigits(chars)) {
                System.out.println("The number consisting of different digits -> " + arrayString[i]);
                return;
            }
        }
    }

    static boolean valueWithDifferentDigits(char chars[]) {
        boolean result = true;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    result = false;
                }
            }
        }
        return result;
    }
}

