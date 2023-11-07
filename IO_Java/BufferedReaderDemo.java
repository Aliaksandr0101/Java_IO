package IO_Java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(
                "C:\\Users\\user\\Desktop\\OverOne\\Java_IO\\BufferedReader\\File.txt"))) {
            String str;
            while( (str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
