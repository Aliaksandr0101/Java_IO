package IO_Java;

import java.io.PrintWriter;
import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthConsoleLine;
        String consoleLine;
        System.out.println("Please enter any string");

        while (true) {
            consoleLine = scanner.nextLine();
            if (consoleLine.equalsIgnoreCase("result")) {
                break;
            }

            lengthConsoleLine = consoleLine.length();

            System.out.println("Output using with println. Length your string = " + lengthConsoleLine);
            System.out.printf("Output using with printf. Length your string = %d", lengthConsoleLine);
            try(PrintWriter pw = new PrintWriter(System.out))
            {
                pw.println("\nOutput using with printWriter" + lengthConsoleLine);
            }


        }

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

