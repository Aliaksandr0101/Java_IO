package IO_Java;

import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String consoleLine;

        while (true){
            consoleLine = scanner.nextLine();
            if (consoleLine.equalsIgnoreCase("result"));
            break;

            
        }

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Введите несколько строк (для завершения введите 'exit'):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Способ 1: Используя метод length() строки
            int lengthMethod = input.length();
            System.out.println("Длина строки (с использованием метода length()): " + lengthMethod);

            // Способ 2: Считая символы в цикле
            int lengthLoop = 0;
            for (char c : input.toCharArray()) {
                lengthLoop++;
            }
            System.out.println("Длина строки (с использованием цикла): " + lengthLoop);

            // Способ 3: Используя метод codePointCount()
            int lengthCodePoint = input.codePointCount(0, input.length());
            System.out.println("Длина строки (с использованием метода codePointCount()): " + lengthCodePoint);
        }

        scanner.close();
*/

    }
}
