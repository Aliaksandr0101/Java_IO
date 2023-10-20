package IO_Java;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ProgramTwo {
    public static void main(String[] args) {
        //Creates an array of byte
        byte [] array = {1,2,4,7};
        ByteArrayInputStream bais = new ByteArrayInputStream(array);
        System.out.println("The bytes read from the input stream");
        for (int i = 0; i < array.length ; i++) {
            //Reads the bytes
            int data = bais.read();
            System.out.printf(data + " ");
        }
        try {
            bais.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
