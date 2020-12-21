package com.epam.borisov.assignment_1.additional_tasks;

import com.epam.borisov.assignment_1.main_tasks.Utility;

public class Task2 {
    /**
     * Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
     */
    public static void main(String[] args) {
        System.out.println("Enter the nums : ");
        String numsString = Utility.scanner();
        averageNumbersLength(numsString);
    }

    private static void averageNumbersLength(String numsString) {
        String arrayString[] = numsString.split(" ");
        double averageLength = 0;
        for (int i = 0; i < arrayString.length; i++) {
            averageLength += arrayString[i].length();
        }
        System.out.println("Average numbers length : " + averageLength / arrayString.length);
        for (String num : arrayString) {
            if (num.length() > averageLength / arrayString.length) {
                System.out.print(num + "; ");
            }
        }
    }
}
