package IO_Java;

import java.io.FileInputStream;
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
        FileInputStream fileIn = new FileInputStream("C:\\Users\\user\\Desktop\\OverOne\\ExampleThreeJavaIO\\Fox.jpg");
        FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\user\\Desktop\\OverOne\\ExampleThreeJavaIO\\FoxTwo.jpg");
        while (fileIn.available()>0){
            int oneByte = fileIn.read();
            fileOutput.write(oneByte);
        }
        inputStream.close();
        outputStream.close();
        fileIn.close();
        fileOutput.close();
        System.out.println();
    }
}
