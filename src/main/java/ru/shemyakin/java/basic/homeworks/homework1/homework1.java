package ru.shemyakin.java.basic.homeworks.homework1;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        greetings();
        checkSign(1, -22, 3);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(10, 2, false);

        //  2 часть со *
        System.out.println("========= 2 часть ===========");
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;
        do {
            System.out.println("Введите число от 1 до 5:");
            userChoice = scanner.nextInt();
        } while (userChoice < 1 || userChoice > 5);
        if (userChoice == 1) {
            greetings();
        } else if (userChoice == 2) {
            int randomA = (int) (Math.random() * 200 - 100);
            int randomB = (int) (Math.random() * 200 - 100);
            int randomC = (int) (Math.random() * 200 - 100);
            System.out.println("a = " + randomA + ", b = " + randomB + ", c = " + randomC);
            checkSign(randomA, randomB, randomC);
        } else if (userChoice == 3) {
            selectColor();
        } else if (userChoice == 4) {
            compareNumbers();
        } else {
            int initValue = (int) (Math.random() * 200 - 100);
            int delta = (int) (Math.random() * 200 - 100);
            boolean increment = (Math.random() * 2 - 1) >= 0;
            System.out.println("initValue = " + initValue + ", delta = " + delta + ", increment = " + increment);
            addOrSubtractAndPrint(initValue, delta, increment);
        }
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 17;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = -2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
