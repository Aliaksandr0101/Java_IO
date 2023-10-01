package IO_Java;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double number;
        String line;
        System.out.println("You enter the number to sum");
        while (true) {
            line = scanner.next();
            if (line.equals("result")) {
                break;
            }

            try {
                number = Double.parseDouble(line);
                sum += number;
            } catch (NumberFormatException e) {
                System.err.println("You did not enter a number. Enter the number or 'result' again to get the result.");
            }
        }
         System.out.println("sum = " + sum);
        
    }
    }


