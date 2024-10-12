import java.util.Scanner;
class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення кількості рядків для верхньої половини ромба
        System.out.print("Введіть кількість рядків для ромба: ");
        int rows = scanner.nextInt();

        // Верхня половина ромба
        for (int i = 1; i <= rows; i++) {
            // Відступи зліва
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Зірочки
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Нижня половина ромба
        for (int i = rows - 1; i >= 1; i--) {
            // Відступи зліва
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Зірочки
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
