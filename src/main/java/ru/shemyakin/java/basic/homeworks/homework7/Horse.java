package ru.shemyakin.java.basic.homeworks.homework7;

public class Horse implements Transport {
    private int stamina;

    static final int Power = 4;
    static final String Name = "лошадь";


    public Horse(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (this.stamina * Power >= distance && terrain != Terrain.MARSH) {
            this.stamina -= distance / Power;
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return Name;
    }
}
