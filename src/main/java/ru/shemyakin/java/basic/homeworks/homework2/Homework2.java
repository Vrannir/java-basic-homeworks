package ru.shemyakin.java.basic.homeworks.homework2;

import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {
        //задание номер 1
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int[] arr3={9,10,11,6};
        System.out.println("Первый массив " + Arrays.toString(arr1));
        System.out.println("Второй массив " + Arrays.toString(arr2));
        System.out.println("Третий массив " + Arrays.toString(arr3));
        int[] arrSum = sumArrays(arr1, arr2, arr3);
        System.out.println("Итоговый массив " + Arrays.toString(arrSum));

        //задание номер 2
        if (isArrayWithMedPoint(arrSum)) {
            System.out.println("Точка равенства есть");
        } else {
            System.out.println("Точки равенства нет");
        }
    }


    private static int[] sumArrays(int[]... arrs) {
        //получаем суммарную длину массивов
        int resultLength = 0;
        for (int[] arr : arrs) {
            resultLength += arr.length;
        }
        //инициализируемновый массив(результат)
        int[] arrResult = new int[resultLength];
        int countResult = 0; //индекс элемента в массиве
        //добавляем последовательно элементы массивов в массив-результат
        for (int[] arr : arrs) {
            for(int arrElement : arr) {
                arrResult[countResult] = arrElement;
                countResult++;
            }
        }
        return arrResult;
    }

    private static boolean isArrayWithMedPoint(int... arrOfInt) {
        int i = 0;
        int sumLeft = 0;
        int j = arrOfInt.length-1;
        int sumRight = 0;
        //двигаемся от начала к концу и от начала в конец пока индексы не "встретятся"
        while (i <= j) {
            if (sumLeft < sumRight) {
                sumLeft += arrOfInt[i];
                i ++;
            } else {
                sumRight += arrOfInt[j];
                j --;
            }
        }
        return sumLeft == sumRight;
    }

}
