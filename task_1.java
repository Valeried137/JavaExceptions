import java.util.Scanner;

// Использование метода и обработка исключения
public class task_1 {
    public static void main(String args[]) {                                     
            
        try {
            System.out.print("Введите число: ");                                   
		    Scanner scan = new Scanner(System.in);                                 
		    int number = scan.nextInt(); 
        
            someMethod(number);
            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }   
    }

// Создание своего исключения
    class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }

// Метод, вызывающий исключение
    public void someMethod(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }
    }
}