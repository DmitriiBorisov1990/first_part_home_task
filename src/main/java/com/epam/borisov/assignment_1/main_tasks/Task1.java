package com.epam.borisov.assignment_1.main_tasks;

import static com.epam.borisov.assignment_1.main_tasks.Utility.scanner;

public class Task1 {
    /**
     * Приветствовать любого пользователя при вводе его имени через командную строку.
     */
    public static void main(String[] args) {
        System.out.println("Enter you name :");
        System.out.println("Hello " + scanner() + "!");
    }
}
