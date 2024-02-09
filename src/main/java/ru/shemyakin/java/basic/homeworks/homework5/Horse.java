package ru.shemyakin.java.basic.homeworks.homework5;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
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

    public float swim(int distance) {
        if (this.stamina > 0) System.out.println(this.name + " плывет");
        if (distance * 4 > this.stamina) {
            this.stamina = 0;
            System.out.println(this.name + " устал");
            return -1;
        } else {
            this.stamina -= distance * 4;
            return (float) distance / this.swimSpeed;
        }
    }

    @Override
    public void info() {
        System.out.println("Имя: " + this.name);
        System.out.println("Скорость бега: " + this.runSpeed);
        System.out.println("Скорость плавания: " + this.swimSpeed);
        System.out.println("Выносливость: " + this.stamina);
    }
}
