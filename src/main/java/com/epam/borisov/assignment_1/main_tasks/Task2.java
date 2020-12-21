package com.epam.borisov.assignment_1.main_tasks;

public class Task2 {
    /**
     * Отобразить в окне консоли аргументы командной строки в обратном порядке.
     */
    public static void main(String[] args) {

        //Если вы используете intellij, перейдите в пункт меню Run > Edit Configurations .
        //Появится диалоговое окно. Теперь вы можете добавить аргументы в поле ввода Program arguments
        //Также можно скомпелировать программу в терменале выполнив команду javac Task2.java
        // и выполнить ее командой java Task2
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Args[" + i + "] " + " = " + args[i]);
        }
    }
}
