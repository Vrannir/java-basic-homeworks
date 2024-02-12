package ru.shemyakin.java.basic.homeworks.homework5;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    public float swim(int distance) {
        return super.swim(distance, 4);
    }
}
