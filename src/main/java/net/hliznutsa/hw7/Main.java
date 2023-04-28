package net.hliznutsa.hw7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 -------------------------------------");
        String str = "Hello Hillel";
        char symbol = 'l';
        System.out.println("Количество символов '" + symbol + "' в строке '" + str + "' = " + findSymbolOccurance(str, symbol) + "\n");

        System.out.println("Задание 2 -------------------------------------");
        String source = "Hello Hillel";
        String target = "illel";
        System.out.println("Номер позиції (індекс) першого елемента підрядка '" + target + "' у рядку '" + source + "' = " + findWordPosition(source, target) + "\n");

        System.out.println("Задание 3 -------------------------------------");
        String strRevers = "Hello";
        System.out.println("Строка '" + strRevers + "' в обратном виде " + stringReverse(strRevers) + "\n");

        System.out.println("Задание 4 -------------------------------------");
        String isPalindromeStr = "Eye eye";
        System.out.println("Является ли '" + isPalindromeStr + "' палиндромом  - " + isPalindrome(isPalindromeStr));
    }

    public static int findSymbolOccurance(String str, char symbol) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
//         Можно ещё испльзовать toUpperCase(); toLowerCase(); , что бы находить символы не смотря на регистр.
            if (str.charAt(i) == symbol)
                count++;
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(stringReverse(str));
    }
}