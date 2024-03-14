package ru.shemyakin.java.basic.homeworks.homework10;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<Integer, Contact> list;

    public PhoneBook() {
        this.list = new HashMap<>();
    }

    public void add(String name, int number) {
        this.list.put(number, new Contact(name, number));
    }

    public void print() {
        System.out.println(this.list);
    }

    public int size() {
        return this.list.size();
    }

    public boolean containsPhoneNumber(int number){
        return this.list.containsKey(number);
    }

    public void find(String name){
        for(Contact elem: this.list.values()) if (elem.getName().equals(name)) System.out.println(elem);
    }
}
