package ru.shemyakin.java.basic.homeworks.homework11;

import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {
        PersonDataBase personBase = new PersonDataBase();
        personBase.add("Ivan", Position.DIRECTOR, 155L);
        personBase.add("Igor", Position.DEVELOPER, 25L);
        personBase.add("Jack", Position.QA, 12345L);
        Person p = personBase.findById(12345L);
        if (personBase.isEmployee(p)) System.out.println(p);

        int[] tArr = {123, 45, 125, 12, 444, 1, 14};
        System.out.println(Arrays.toString(tArr));
        bubbleSort(tArr);
        System.out.println(Arrays.toString(tArr));
    }

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            boolean isSwaps = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int buf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buf;
                    isSwaps = true;
                }
            }
            if (!isSwaps) break;
        }
    }
}
