package IO_Java;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lengthLineArray = new ArrayList();
        int lengthConsoleLine;
        String consoleLine;
        PrintWriter writer = new PrintWriter(System.out);
        System.out.println("Please enter any string. To get the result, write 'result'");
        while (true) {
            consoleLine = scanner.nextLine();
            lengthConsoleLine = consoleLine.length();
            lengthLineArray.add(lengthConsoleLine);
            if (consoleLine.equalsIgnoreCase("result")) {

                System.out.println("Output the length of your lines");
                for (int i = 0; i < lengthLineArray.size() ; i++) {
                    System.out.println("Output using with println. Length your string = " + lengthLineArray.get(i));
                    System.out.printf("Output using with printf. Length your string = %d\n", lengthLineArray.get(i));
                    writer.println("Output using with printWriter. Length your string = " + lengthLineArray.get(i));
                }
                writer.flush();
            }
        }
    }
    }





