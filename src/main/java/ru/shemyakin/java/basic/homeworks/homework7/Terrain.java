package ru.shemyakin.java.basic.homeworks.homework7;

public enum Terrain {
    PLAIN("равнина"),
    FOREST("лес"),
    MARSH("болото");

    private String name;

    Terrain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
