package ru.shemyakin.java.basic.homeworks.homework10;

public class Homework10 {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Fedor", 123454321);
        book.print();
        book.add("John", 1090909);
        book.print();
        book.add("Fedor", 5767657);
        book.print();
        System.out.println(book.size());
        System.out.println(book.containsPhoneNumber(1090109));
        book.find("Fedor");

    }
}
