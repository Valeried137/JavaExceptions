Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.

Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от класса Exception. Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей обработки.

**Калькулятор**
Напишите программу-калькулятор, которая запрашивает у пользователя два числа и выполняет все операции операции(+, -, *, /) и возведения первого числа в степень второго числа. Если введены некорректные числа или происходит деление на ноль, необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
Важно! С использованием принципа одного уровня абстракции!
*В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(), выполняющий операцию возведения числа в степень. Если введено некорректное основание (ноль) и отрицательная степень, выбрасывается исключение InvalidInputException.

В методе main() мы запрашиваем у пользователя основание и показатель степени, вызываем метод calculatePower() и выводим результат. Если введены некорректные числа или происходит ошибка ввода, соответствующие исключения перехватываются и выводится информативное сообщение об ошибке.

Обратите внимание, что в этой задаче мы использовали собственное исключение InvalidInputException, чтобы явно указать на некорректный ввод. Это помогает разделить обработку ошибок на соответствующие уровни абстракции.#   J a v a E x c e p t i o n s  
 