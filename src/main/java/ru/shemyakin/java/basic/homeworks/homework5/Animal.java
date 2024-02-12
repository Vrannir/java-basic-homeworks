package ru.shemyakin.java.basic.homeworks.homework5;

public abstract class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int stamina;

    public Animal(String name, int runSpeed, int swimSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public float run(int distance) {
        if (this.stamina > 0) System.out.println(this.name + " бежит");
        if (distance > this.stamina) {
            this.stamina = 0;
            System.out.println(this.name + " устал");
            return -1;
        } else {
            this.stamina -= distance;
            return (float) distance / this.runSpeed;
        }
    }

    public float swim(int distance, int staminaCost) {
        if (this.stamina > 0) System.out.println(this.name + " плывет");
        if (distance * staminaCost > this.stamina) {
            this.stamina = 0;
            System.out.println(this.name + " устал");
            return -1;
        } else {
            this.stamina -= distance * staminaCost;
            return (float) distance / this.swimSpeed;
        }
    }

    public void info() {
        System.out.println("Имя: " + this.name);
        System.out.println("Скорость бега: " + this.runSpeed);
        System.out.println("Скорость плавания: " + this.swimSpeed);
        System.out.println("Выносливость: " + this.stamina);
    }

}
