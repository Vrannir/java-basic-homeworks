package ru.shemyakin.java.basic.homeworks.homework7;

public class Car implements Transport {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (this.fuel * 10 >= distance && (terrain != Terrain.FOREST && terrain != Terrain.MARSH)) {
            this.fuel -= distance / 10;
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "автомобиль";
    }
}
