package ru.shemyakin.java.basic.homeworks.homework7;

public class Car implements Transport {
    private int fuel;

    static final int FuelValue = 10;
    static final String Name = "автомобиль";


    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (this.fuel * FuelValue >= distance && (terrain != Terrain.FOREST && terrain != Terrain.MARSH)) {
            this.fuel -= distance / FuelValue;
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return Name;
    }
}
