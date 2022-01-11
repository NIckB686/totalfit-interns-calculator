package calculator;
import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Пожалуйчта, введите выражение следующего вида:");
        System.out.println("первое_число, второе_число, операция");
        String expression = scanner.nextLine().trim();
        int firstInteger = getFirstInt(expression);
        int secondInteger = getSecondInt(expression);
        int result = calculator(expression, firstInteger, secondInteger);
        System.out.println("Результат:");
        System.out.println(result);
    }
    public static int getFirstInt(String src) {
        int index1 = src.indexOf(",");
        return Integer.parseInt(src.substring(0, index1).trim());
    }
    public static int getSecondInt(String src) {
        int index2 = src.lastIndexOf(",");
        int index1 = src.indexOf(",");
        return Integer.parseInt(src.substring(index1, index2).trim());
    }

    public static int calculator(String src, int num1, int num2) {
        char[] chars = src.toCharArray();
        int result = 0;
        for (char symbol : chars) {
            if (symbol == '+') {
                result = num1 + num2;
            } else if (symbol == '-') {
                result = num1 - num2;
            } else if (symbol == '*') {
                result = num1 * num2;
            } else if (symbol == '/') {
                result = num1 / num2;
            } else {
                System.out.println("Операция не распознана или была введена некорректно. Повторите ввод.");

            }
        }
        return result;
    }


}

