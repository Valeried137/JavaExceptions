import java.util.Scanner;

public class task_2 {
    public static void main(String args[]) {                                     
            
        try {
            System.out.print("Введите делимое: ");                                   
		    Scanner scan1 = new Scanner(System.in);                                 
		    int number1 = scan1.nextInt(); 
            System.out.print("Введите делитель: ");                                   
		    Scanner scan2 = new Scanner(System.in);                                 
		    int number2 = scan2.nextInt();

            someMethod(number2);
             System.out.println("Результат деления:" + number1 / number2);
            }catch (DivisionByZeroException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    public void someMethod(int number) throws DivisionByZeroException {
        if (number2 = 0) {
            throw new DivisionByZeroException("Деление на ноль недпаустимо");
        }
    }
}