package IO_Java;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String consoleLine;
        double number;
        double sum = 0;
        System.out.println("Please enter the number to sum");
        while (true){
            consoleLine = scanner.next();

            if (consoleLine.equalsIgnoreCase("result")) {
                break;
            }

            try {
                number = Double.parseDouble(consoleLine);
                sum += number;
            } catch(NumberFormatException e) {
                System.out.println("You did not enter a number. Try again or enter the 'result' to get the total.");
            }
        }
        scanner.close();
        System.out.println("Sum your numbers = " + sum);
        

    }
    }


