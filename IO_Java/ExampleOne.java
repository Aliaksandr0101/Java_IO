package IO_Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Мы прочитали эту строку 34");
        String LineThree = scanner.nextLine();
        scanner.close();
        System.out.println(LineThree);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Мы прочитали эту строку");
        String LineOne = bufferedReader.readLine();
        bufferedReader.close();
        System.out.println(LineOne);
    }
}
