package ru.shemyakin.java.basic.homeworks.homework2;

import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        int[] arr3 = {10, 11, 18, 23};

        System.out.println("Первый массив " + Arrays.toString(arr1));
        System.out.println("Второй массив " + Arrays.toString(arr2));
        System.out.println("Третий массив " + Arrays.toString(arr3));

        System.out.println("Задание 1");
        int[] arrSum = sumArrays(arr1, arr2, arr3);
        System.out.println("Итоговый массив " + Arrays.toString(arrSum));

        System.out.println("Задание 2");
        if (isArrayWithMedPoint(arrSum)) {
            System.out.println("Точка равенства есть");
        } else {
            System.out.println("Точки равенства нет");
        }

        System.out.println("Задание 3");
        if (isArrayInc(arrSum)) {
            System.out.println("Все элементы массива идут по возрастанию");
        } else {
            System.out.println("Не все элементы массива идут по возрастанию");
        }
        System.out.println(5 / 2);
        System.out.println("Задание 4");
        System.out.println(Arrays.toString(flipArray(arrSum)));

    }


    private static int[] sumArrays(int[]... arrs) {
        int resultLength = 0;
        for (int[] arr : arrs) {
            if (resultLength < arr.length) resultLength = arr.length;
        }
        int[] arrResult = new int[resultLength];
        for (int[] arr : arrs) {
            int counter = 0;
            for (int arrElement : arr) {
                arrResult[counter] += arrElement;
                counter++;
            }
        }
        return arrResult;
    }

    private static boolean isArrayWithMedPoint(int... arrOfInt) {
        int i = 0;
        int sumLeft = 0;
        int j = arrOfInt.length - 1;
        int sumRight = 0;
        while (i <= j) {
            if (sumLeft < sumRight) {
                sumLeft += arrOfInt[i];
                i++;
            } else {
                sumRight += arrOfInt[j];
                j--;
            }
        }
        return sumLeft == sumRight;
    }

    private static boolean isArrayInc(int... arrOfInt) {
        int i = 0;
        while (i < arrOfInt.length - 1) {
            if (arrOfInt[i] > arrOfInt[i + 1]) return false;
            i++;
        }
        return true;
    }

    private static int[] flipArray(int... arrOfInt) {
        int lengthOfArray = arrOfInt.length;
        int[] arrResult = new int[lengthOfArray];
        for (int i = 0; i <= lengthOfArray / 2; i++) {
            arrResult[i] = arrOfInt[lengthOfArray - i - 1];
            arrResult[lengthOfArray - i - 1] = arrOfInt[i];
        }
        return arrResult;
    }
}
