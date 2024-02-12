package ru.shemyakin.java.basic.homeworks.homework5;

public class Cat extends Animal {

    public Cat(String name, int runSpeed, int stamina) {
        super(name, runSpeed, 0, stamina);
    }

    public float swim(int distance) {
        System.out.println("Коты не плавают!!!");
        return -1;
    }
}
