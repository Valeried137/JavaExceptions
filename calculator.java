package JavaExceptions;

import java.util.Scanner;
import static java.lang.Math.pow;

public class calculator {
    static Scanner scan = new Scanner(System.in); 
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат:" + result);
    }

    // Ввод числа пользователем и его проверка
    public static int getInt() {
        System.out.println("Введите число: ");
        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Некорректное число, попробуйте ввод снова");
            scan.next();
            num = getInt();
        }
        return num;
    }
    // Ввод знака операции пользователем и его проверка
    public static char getOperation() {
        System.out.println("Выберете знак операции: + - * / с - возвести в степень");
        char operation;
        if (scan.hasNext()) {
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Не верный знак, попробуйте выбрать снова: + - * / c - возсести в степень");
            scan.next();
            operation = getOperation();
        }
        return operation;
    }
    // Математические операции
    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try {
                    someMethod(num2);
                    System.out.println("Результат:" + result);
                } catch (InvalidInputException e) {
                    System.out.println("Ошибка:" + e.getMessage());
                }
            case 'с':
                try {
                    calculatePower();
                    System.out.println("Результат:" + result);
                } catch (InvalidInputException e) {
                    System.out.println("Ошибка:" + e.getMessage());
                }
                break;
            default:
                System.out.println("Неверно, попробуйте еще раз");
                result = calc(num1, num2, getOperation());
        }

        return result;
    }

public class PowerCalculator {
    public static int calculatePower(int num1, int num2, char operation){
    int result = 1;
    for (int i = 1; i <= num2; i++) {
        result = result * num1;
        }
    return result;      
    }
}

    class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }

    public static void someMethod(int num2) throws InvalidInputException {
        if (num2 <= 0) {
            throw new InvalidInputException("Деление на ноль недопустимо");
        }
    }
}