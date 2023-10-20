package IO_Java;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello world";
        byte [] buffer = text.getBytes();
        try {
            baos.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        //Превращаем массив байтов в  строку
        System.out.println(baos.toString());
        //Получаем массив байтов и выводим по символьно
        byte [] array = baos.toByteArray();
        for (byte b : array) {
            System.out.println((char)(b));
        }
        System.out.println();
    }
}
