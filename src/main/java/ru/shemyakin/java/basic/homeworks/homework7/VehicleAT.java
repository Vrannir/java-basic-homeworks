package ru.shemyakin.java.basic.homeworks.homework7;

public class VehicleAT implements Transport {
    private int fuel;

    static final int FuelValue = 5;
    static final String Name = "вездеход";

    public VehicleAT(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (this.fuel * FuelValue >= distance) {
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
