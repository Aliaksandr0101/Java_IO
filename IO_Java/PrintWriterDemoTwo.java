package IO_Java;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemoTwo {
    public static void main(String[] args) {
        String s1 = "Привет мир!";
        String s2 = "Hello world!";
        try(PrintWriter printWriter  = new PrintWriter(
                "C:\\Users\\user\\Desktop\\OverOne\\Java_IO\\BufferedReader\\FileWriterTwo.txt")){
            printWriter.println(s1);
            int i = 2;
            printWriter.printf("Квадрат число %d равен %d %n", i, i*2);
            printWriter.write(s2);
            printWriter.print("Конец");
            System.out.println("Запись в файл произведена");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
