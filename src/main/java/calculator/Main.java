package main.java.calculator;
import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Пожалуйчта, введите выражение следующего вида:");
        System.out.println("первое_число, второе_число, операция");
        String expression = scanner.nextLine().trim();
        char operation = getOperation(expression);
        int firstInteger = getFirstInt(expression);
        int secondInteger = getSecondInt(expression);
        int result = calculator(firstInteger, secondInteger, operation);
        System.out.println("Результат:");
        System.out.println(result);
    }

    public static char getOperation(String src) {
        /*
        В этом методе будем "вытаскивать" знак операции из строки
         */
        char[] chars = src.toCharArray();
        for (char symbol : chars) {

            if (symbol == '+') {
                return '+';
            } else if (symbol == '-') {
                return '-';
            } else if (symbol == '*') {
                return '*';
            } else if (symbol == '/') {
                return '/';
            } else {
                System.out.println("Операция не распознана или была введена некорректно. Повторите ввод.");

            }
        }
        return 0;
    }
    public static int getFirstInt(String src) {
        /*
        В этом методе будем находить первое число, с которыми нужно проводить вычисления.
         */
        int index1 = src.indexOf(",");
        int firstInteger = Integer.parseInt(src.substring(0, index1).trim());
        return firstInteger;
    }
    public static int getSecondInt(String src) {
        /*
        В этом методе будем находить второе число, с которым нужно проводить вычисления.
         */
        int index2 = src.lastIndexOf(",");
        int index1 = src.indexOf(",");
        int secondInteger = Integer.parseInt(src.substring(index1, index2).trim());
        return secondInteger;
    }
    public static int calculator(int num1, int num2, char operation) {
        /*
        В этом методе, собственно, и будем проводить вычисления
         */
        int result = 0;
        switch (operation) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1-num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана или была введена некорректно. Повторите ввод.");
        }
        return result;
    }


}

