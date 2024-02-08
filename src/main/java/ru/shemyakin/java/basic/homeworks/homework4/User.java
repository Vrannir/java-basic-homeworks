package ru.shemyakin.java.basic.homeworks.homework4;

public class User {
    private String firstName;
    private String middleName;
    private String secondName;
    private int yearOfBirth;
    private String email;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public User(String firstName, String middleName, String secondName, int yearOfBirth, String email) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public void printUserInfo() {
        System.out.println("ФИО: " + secondName + " " + firstName + " " + middleName);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("e-mail: " + email);
        System.out.println();
    }


}
