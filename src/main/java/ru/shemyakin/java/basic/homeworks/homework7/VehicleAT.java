package ru.shemyakin.java.basic.homeworks.homework7;

public class VehicleAT implements Transport {
    private int fuel;

    public VehicleAT(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (this.fuel * 5 >= distance) {
            this.fuel -= distance / 5;
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "вездеход";
    }
}
