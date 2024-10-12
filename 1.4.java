import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення двох чисел
        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        // Введення оператора
        System.out.print("Введіть оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Вибір операції
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Помилка: Ділення на нуль неможливе.");
                }
                break;

            default:
                System.out.println("Помилка: Неприпустимий оператор.");
                break;
        }

        scanner.close();
    }
}