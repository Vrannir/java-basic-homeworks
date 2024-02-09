package ru.shemyakin.java.basic.homeworks.homework5;

public class Homework5 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Пушок", 2, 10);
        System.out.println("Время: " + cat1.run(10) + " сек.");
        System.out.println();
        cat1.info();
        Dog dog1 = new Dog("Туман", 4, 2, 15);
        System.out.println("Время: " + dog1.swim(3) + " сек.");
        System.out.println();
        dog1.info();
        Horse horse1 = new Horse("Закат", 7, 1, 30);
        System.out.println("Время: " + horse1.swim(8) + " сек.");
        System.out.println();
        horse1.info();
        System.out.println();
        System.out.println("Время: " + horse1.run(1) + " сек.");
    }
}
