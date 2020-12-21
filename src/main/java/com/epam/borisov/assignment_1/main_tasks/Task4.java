package com.epam.borisov.assignment_1.main_tasks;

import java.util.Scanner;

public class Task4 {
    /**
     * Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
     * и вывести результат на консоль.
     */
    static int product = 1;

    public static void main(String[] args) {
        int sum = 0;
        String str;
        String[] arr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        if (in.hasNextLine()) {
            str = in.nextLine();
            arr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                sum += Integer.parseInt(arr[i]);
                product *= Integer.parseInt(arr[i]);
            }
            System.out.println("The sum is : " + sum + "\nThe product is : " + product);
        }
    }
}
