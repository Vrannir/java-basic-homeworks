package ru.shemyakin.java.basic.homeworks.homework7;

public class Homework7 {
    public static void main(String[] args) {
        Human man = new Human("Иван");
        Bicycle bike = new Bicycle();
        man.getInTransport(bike);
        man.getOutTransport();
        man.getInTransport(bike);
        man.move(10, Terrain.MARSH);
    }
}
