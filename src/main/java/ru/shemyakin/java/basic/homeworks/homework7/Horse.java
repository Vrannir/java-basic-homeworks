package ru.shemyakin.java.basic.homeworks.homework7;

public class Horse implements Transport{
    private int stamina;

    public Horse(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (this.stamina * 4 > distance && terrain != Terrain.MARSH) {
            this.stamina -= distance / 4;
            return true;
        }
        return false;
    }
}
