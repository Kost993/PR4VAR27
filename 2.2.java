import java.util.Scanner;

class SentenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод текста
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        // Лічильник речень
        int sentenceCount = 0;

        // Перевірка кожного символа у тексті
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Збільшення лічильника для кожного знака, який закінчує речення
            if (ch == '.' || ch == '!' || ch == '?') {
                sentenceCount++;
            }
        }

        System.out.println("Кількість речень: " + sentenceCount);

        scanner.close();
    }
}
