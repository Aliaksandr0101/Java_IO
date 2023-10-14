package IO_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleTestTwo {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\user\\Desktop\\OverOne\\ExampleThreeJavaIO\\Резюме.docx");
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\OverOne\\ExampleThreeJavaIO\\result.docx");
        byte [] buffer = new byte[1000];
        while(inputStream.available()>0) {
            int count = inputStream.read(buffer);
            outputStream.write(buffer,0,count);
        }
        inputStream.close();
        outputStream.close();
    }
}
