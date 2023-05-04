package net.hliznutsa.hw8;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] strings = {
                {"5", "3", "1", "8"},
                {"5", "3", "9", "2"},
                {"9", "6", "7", "4"},
                {"3", "5", "2", "7"}};

        try {
            int result = doCalc(strings);
            System.out.println("Результат подсчёта: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int doCalc(String[][] str) throws ArraySizeException, ArrayDataException {
        if (str.length != 4) {
            throw new ArraySizeException("Массив не квадратный или больше/меньше чем 4х4");
        }
        for (int i = 0; i < 4; i++) {
            if (str[i].length != 4) {
                throw new ArraySizeException("Массив не квадратный или больше/меньше чем 4х4");
            }
        }

        int summa = 0;

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                try {
                    summa += Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Ошибка в элементе [" + i + "][" + j + "]: " + e.getMessage());
                }
            }
        }
        return summa;
    }
}