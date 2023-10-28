package IO_Java;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleFive {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\user\\Desktop\\OverOne\\Java_IO\\production\\Java_IO\\ExampleFive.txt";
        try {
            FileReader reader = new FileReader(filePath);
            int charCount;
            int aCount = 0;
            while ((charCount = reader.read()) != -1) {
                char character = (char) charCount;
                if (character == 'а' || character == 'А') {
                    aCount++;
                }
            }
            reader.close();

            FileWriter writer = new FileWriter(filePath);
            writer.write("Number of letters 'a' in the file: " + aCount);
            writer.close();

            System.out.println("Number of letters 'a' in the file: " + aCount);
            System.out.println("The data was successfully written back to the file.");
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
