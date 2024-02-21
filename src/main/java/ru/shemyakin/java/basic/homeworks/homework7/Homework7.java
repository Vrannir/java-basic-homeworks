package ru.shemyakin.java.basic.homeworks.homework7;

public class Homework7 {
    public static void main(String[] args) {
        Human man = new Human("Иван");
        Bicycle bike = new Bicycle();
        Car car = new Car(10);
        Horse horse = new Horse(6);
        VehicleAT vehicle = new VehicleAT(20);
        man.getInTransport(bike);
        man.getOutTransport();
        man.getInTransport(vehicle);
        man.move(24, Terrain.MARSH);
        man.getOutTransport();
        man.getInTransport(horse);
        man.move(16, Terrain.FOREST);
    }
}
