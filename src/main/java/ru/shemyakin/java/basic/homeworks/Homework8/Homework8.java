package ru.shemyakin.java.basic.homeworks.Homework8;

public class Homework8 {
    static final int ArrLength = 4;

    public static void main(String[] args) {
        String[][] testArray = {
                {"13", "43", "7", "22"},
                {"5", "-1", "5", "0"},
                {"-31", "66", "93", "26"},
                {"8", "14", "-17", "55"}
        };
        try{
            System.out.println("Сумма элементов массива: " + sumArray(testArray));
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int sumArray(String[][] arrString) throws AppArraySizeException, AppArrayDataException {
        int result = 0;
        if(arrString.length == ArrLength){
            for(int i = 0; i < ArrLength; i++){
                if(arrString[i].length != ArrLength) throw new AppArraySizeException("Неверный размер массива");
                for(int j = 0; j < ArrLength; j++) {
                    try {
                        result += Integer.parseInt(arrString[i][j]);
                    } catch (NumberFormatException e) {
                        throw new AppArrayDataException("Элемент массива в ячейке (" + (i + 1) + " : " + (j + 1) + ") не является числом");
                    }
                }
            }
        }
        else throw new AppArraySizeException("Неверный размер массива");
        return result;
    }
}
