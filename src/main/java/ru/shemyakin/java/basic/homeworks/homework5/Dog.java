package ru.shemyakin.java.basic.homeworks.homework5;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    public float swim(int distance) {
        return super.swim(distance, 2);
    }
}
