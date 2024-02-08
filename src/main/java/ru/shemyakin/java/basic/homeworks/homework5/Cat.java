package ru.shemyakin.java.basic.homeworks.homework5;

public class Cat extends Animal{

    public Cat(String name, int runSpeed, int stamina) {
        super(name, runSpeed, stamina);
    }

    @Override
    public float run(int distance){
        if(distance > this.stamina) {
            this.stamina = 0;
            System.out.println("Кошка "+this.name+" устала");
            return -1;
        }
        else {
            this.stamina -= distance;
            System.out.println("Кошка "+this.name+" бежит");
            return  (float) (distance /  this.runSpeed);
        }
    }

    @Override
    public void info(){
        System.out.println("Имя: " +  this.name);
        System.out.println("Скорость бега: " + this.runSpeed);
        System.out.println("Выносливость: " + this.stamina);
    }
}
