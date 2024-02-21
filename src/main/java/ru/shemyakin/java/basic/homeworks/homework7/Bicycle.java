package ru.shemyakin.java.basic.homeworks.homework7;

public class Bicycle implements Transport {

    public Bicycle() {
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        return !(terrain == Terrain.MARSH);
    }

    @Override
    public String getName() {
        return "велосипед";
    }
}
