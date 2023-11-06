package IO_Java;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("C:\\Users\\user\\Desktop\\OverOne\\Java_IO\\BufferedReader\\FileWriter.txt"))) {
            String text = "He - llo world";
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.write(text);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }
}
