import java.util.Scanner;

public class Calculator {
    public static void main (String[] argse) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите действие (+, -, *, /)");
        char c = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        if (c == '+'){
            double result = num1 + num2;
            System.out.println("Результат сложения: " + result);
        }
        else if (c == '-'){
            double result = num1 - num2;
            System.out.println("Результат вычитания: " + result);
        } else if (c == '*') {
            double result = num1 * num2;
            System.out.println("Результат умножения: " +  result);
        } else if (c == '/') {
            double result = num1 / num2;
            System.out.println("Результат деления: " + result);
        } else {
            System.out.println("Хуйню ввел вместо действия, пробуй еще раз");
        }
    }
}
