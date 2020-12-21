package com.epam.borisov.assignment_1.additional_tasks;

import com.epam.borisov.assignment_1.main_tasks.Utility;

public class Task1 {
    /**
     * Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
     */
    public static void main(String[] args) {
        System.out.println("Enter the nums : ");
        String numsString = Utility.scanner();
        longNumbers(transformationIntoArrayInteger(numsString));
    }

    private static void longNumbers(int[] numbersArray) {
        int shortNumber = numbersArray[0];
        int longNumber = numbersArray[0];
        for (int number : numbersArray) {
            if (shortNumber > number) {
                shortNumber = number;
            } else if (longNumber < number) {
                longNumber = number;
            }
        }
        System.out.println("short number : " + shortNumber + " length : " + (Integer.toString(shortNumber)).length());
        System.out.println("long number : " + longNumber + " length : " + (Integer.toString(longNumber)).length());
    }

    private static int[] transformationIntoArrayInteger(String stringOfNumbers) {
        String arrayString[] = stringOfNumbers.split(" ");
        int arrayInteger[] = new int[arrayString.length];
        for (int i = 0, j = 0; i < arrayString.length; i++, j++) {
            arrayInteger[i] = Integer.parseInt(arrayString[j]);
        }
        return arrayInteger;
    }
}
