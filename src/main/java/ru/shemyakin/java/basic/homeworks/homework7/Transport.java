package ru.shemyakin.java.basic.homeworks.homework7;

public interface Transport {
    boolean move(int distance, Terrain terrain);

    String getName();
}
