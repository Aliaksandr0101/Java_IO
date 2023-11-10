package IO_Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Desktop\\OverOne\\Java_IO\\PrintWriter.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Super");
        printWriter.printf("%n Soup %d", 45);
        printWriter.print("hghbh");
        printWriter.close();
    }
}
