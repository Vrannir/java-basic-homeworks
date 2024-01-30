package ru.shemyakin.java.basic.homeworks.homework3;

public class Homework3 {
    public static void main(String[] args) {
        int[][] arr = {{1, 12, -3}, {4, 25, 6}, {7, -8, 9}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Сумма всех элементов больших нуля: " + sumOfPositiveElements(arr));
        System.out.println();
        printSquare(5);
        System.out.println();
        zeroDiagonal(arr2);
        printArray(arr2);
        System.out.println();
        System.out.println("Максимальный элемент массива: " + findMax(arr));
        System.out.println();
        System.out.println("Сумма элементов 2-ой строки массива: " + secondRowSum(arr));
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int sumOfPositiveElements(int[][] array) {
        int sumOfPositive = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) sumOfPositive += array[i][j];
            }
        }
        return sumOfPositive;
    }

    private static void printSquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - 1; j++) {
                System.out.print("* ");
            }
            System.out.println('*');
        }
    }

    private static void zeroDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
        }
    }

    private static int findMax(int[][] array) {
        int result = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (result < array[i][j]) result = array[i][j];
            }
        }
        return result;
    }

    private static int secondRowSum(int[][] array) {
        if (array.length < 2) return -1;
        int rowSum = 0;
        for (int i = 0; i < array[1].length; i++) {
            rowSum += array[1][i];
        }
        return rowSum;
    }
}
