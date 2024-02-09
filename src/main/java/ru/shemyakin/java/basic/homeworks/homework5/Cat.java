package ru.shemyakin.java.basic.homeworks.homework5;

public class Cat extends Animal {

    public Cat(String name, int runSpeed, int stamina) {
        super(name, runSpeed, 0, stamina);
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

    @Override
    public void info() {
        System.out.println("Имя: " + this.name);
        System.out.println("Скорость бега: " + this.runSpeed);
        System.out.println("Выносливость: " + this.stamina);
    }
}
