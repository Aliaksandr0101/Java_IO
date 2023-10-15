package IO_Java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExampleFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the writer string in file");
        int lengthString = scanner.nextInt();
        String stringConsole;

        try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\user\\Desktop\\OverOne\\ExampleFour\\result.txt"))) {
            System.out.println("Please enter your string or exit to finish");

            while (true) {
                stringConsole = scanner.nextLine();
                if (stringConsole.equalsIgnoreCase("exit")) {
                    break;
                }
                if (stringConsole.length() > lengthString) {
                    writer.println(stringConsole);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();

        System.out.println("File writing completed");
    }
}
