package IO_Java;

import java.util.Scanner;

public class ExampleSix {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your surname: ");
            String surname = scanner.nextLine();

            System.out.print("Please enter your phone number: ");
        
            String phoneNumber = scanner.nextLine();

            scanner.close();

            System.out.printf(" User surname: %s%n User name: %s%n User phone number: %s%n", surname, name, phoneNumber);

        }
    }


