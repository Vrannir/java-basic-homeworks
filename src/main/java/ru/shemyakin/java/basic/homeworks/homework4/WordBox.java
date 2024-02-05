package ru.shemyakin.java.basic.homeworks.homework4;

public class WordBox {
    private int width;
    private int depth;
    private int height;
    private String color;
    private boolean isOpened;
    private String item;

    public WordBox(int width, int depth, int height, String color) {
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.color = color;
        this.isOpened = false;
        this.item = "";
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Меняем цвет коробки на " + color);
    }

    public void openBox() {
        isOpened = true;
        System.out.println("Открываем коробку");
    }

    public void closeBox() {
        isOpened = false;
        System.out.println("Закрываем коробку");
    }

    public void printInfo() {
        System.out.println("ШГВ: " + width + ", " + depth + ", " + height);
        System.out.println("Цвет: " + color);
        if (isOpened) System.out.println("Статус: открыта");
        else System.out.println("Статус: закрыта");
        System.out.println("предмет: " + item);
        System.out.println();
    }

    public void clearBox() {
        if (isOpened) {
            System.out.println("Выбрасываем \"" + item + "\" из коробки");
            item = "";
        }
    }

    public void putItem(String item) {
        if (isOpened) this.item = item;
        System.out.println("помещаем \"" + item + "\" в коробку");
    }
}
