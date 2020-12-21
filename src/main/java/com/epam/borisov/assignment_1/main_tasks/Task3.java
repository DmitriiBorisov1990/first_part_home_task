package com.epam.borisov.assignment_1.main_tasks;

import static com.epam.borisov.assignment_1.main_tasks.Utility.randomNum;
import static com.epam.borisov.assignment_1.main_tasks.Utility.scanner;

public class Task3 {
    /**
     * Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
     */
    static int counter = 1;

    public static void main(String[] args) {

        System.out.println("Inter number amount");
        int num = Integer.parseInt(scanner());

        for (int i = 0; i < num; i++) {
            int randomNumber = randomNum();
            if (counter % 2 == 0) {
                System.out.println(randomNumber + ";");
            } else {
                System.out.print(randomNumber + ";");
            }
            counter++;
        }
    }
}
