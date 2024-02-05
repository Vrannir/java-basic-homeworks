package ru.shemyakin.java.basic.homeworks.homework4;

public class Homework4 {
    public static void main(String[] args) {

        User[] Users = {
                new User("Сидор", "Сидорович", "Сидоров", 1982, "sidor23423@mail.ru"),
                new User("Иван", "Иванович", "Иванов", 1975, "ivanov1975@mail.ru"),
                new User("Игорь", "Сергеевич", "Петров", 1985, "petrov85@mail.ru"),
                new User("Георгий", "Степанович", "Неклюсов", 1963, "fekk.gosha@mail.ru"),
                new User("Петр", "Афанасьевич", "Евграфов", 1979, "evgrafovpetr79@mail.ru"),
                new User("Семен", "Семенович", "Свиридов", 1989, "sema9891@mail.ru"),
                new User("Илья", "Иванович", "Скородум", 1987, "fastbrain87@mail.ru"),
                new User("Виктор", "Евгеньевич", "Мазуновский", 1992, "pobeditel.maz92@mail.ru"),
                new User("Дмитрий", "Игоревич", "Свердлов", 1978, "dis1978@mail.ru"),
                new User("Александр", "Сергеевич", "Баженов", 1986, "as.nepushkin@mail.ru")
        };

        int counter = 0;
        for (int i = 0; i < Users.length; i++) {
            if ((2024 - Users[i].getYearOfBirth()) > 40) {
                counter++;
                System.out.println(counter + " =======================");
                Users[i].printUserInfo();
            }
        }

        System.out.println("---------------------------------------------------");

        WordBox myBox = new WordBox(10, 20, 30, "синяя");
        myBox.printInfo();
        myBox.openBox();
        myBox.putItem("матрешка");
        myBox.printInfo();
        myBox.clearBox();
        myBox.printInfo();

    }
}
