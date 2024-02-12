package ru.shemyakin.java.basic.homeworks.homework6;

public class Homework6 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Pushok", 7),
                new Cat("Ryzhik", 4),
                new Cat("Murzik", 3)
        };
        Plate plate = new Plate(11);
        for (int i = 0; i < cats.length; i++) cats[i].eat(plate);
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isSatiety()) System.out.println(cats[i].getName() + " сыт");
            else System.out.println(cats[i].getName() + " голоден");
        }
    }
}
