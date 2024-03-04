package ru.shemyakin.java.basic.homeworks.Homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите min:");
        int min = scanner.nextInt();
        System.out.println("Введите max:");
        int max = scanner.nextInt();
        try {
            ArrayList<Integer> newIntArrList = formIntArrayList(min, max);
            System.out.println(newIntArrList);
            System.out.println(sumArrayList(newIntArrList));
            pushIntToList(111, newIntArrList);
            System.out.println(newIntArrList);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 0, -1, 10, -6));
        System.out.println(arrList);
        incListForNum(6, arrList);
        System.out.println(arrList);
        ArrayList<Employee> listEmployee = new ArrayList<>(
                Arrays.asList(
                        new Employee("John", 26),
                        new Employee("Anna", 24),
                        new Employee("Ben", 32),
                        new Employee("Mary", 27)
                ));
        System.out.println(listEmployee);
        System.out.println(getListOfNames(listEmployee));
        System.out.println(getListOfAge(listEmployee, 25));
        System.out.println(qualifyAge(listEmployee, 32));
        System.out.println(youngestEmployee(listEmployee));
    }

    public static ArrayList<Integer> formIntArrayList(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Первый аргумент не может быть больше второго");
        } else {
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = min; i <= max; i++) {
                result.add(i);
            }
            return result;
        }
    }

    public static int sumArrayList(ArrayList<Integer> arrList) {
        int result = 0;
        for (Integer elem : arrList) {
            if (elem > 5) result += elem;
        }
        return result;
    }

    public static void pushIntToList(int number, ArrayList<Integer> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            arrList.set(i, number);
        }
    }

    public static void incListForNum(int number, ArrayList<Integer> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            arrList.set(i, arrList.get(i) + number);
        }
    }

    public static ArrayList<String> getListOfNames(ArrayList<Employee> list) {
        ArrayList<String> result = new ArrayList<>();
        for (Employee employee : list) {
            result.add(employee.getName());
        }
        return result;
    }

    public static ArrayList<Employee> getListOfAge(ArrayList<Employee> list, int minAge) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getAge() >= minAge) result.add(employee);
        }
        return result;
    }

    public static boolean qualifyAge(ArrayList<Employee> list, int avgAge) {
        int sumAge = 0;
        for (Employee employee : list) {
            sumAge += employee.getAge();
        }
        return (sumAge / list.size()) > avgAge;
    }

    public static Employee youngestEmployee(ArrayList<Employee> list) {
        Employee youngEmp = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (youngEmp.getAge() > list.get(i).getAge()) youngEmp = list.get(i);
        }
        return youngEmp;
    }
}
