package IO_Java;

import java.io.*;

public class ProgramThree {
    public static void main(String[] args) throws IOException {
        //Исходные данные - массив целых чисел.
        int [] arrayInt = {2, 5, 70, -33};
        //1. Записать массив в байтовый файл integers.bin
        //1.1 Cоздать файловый байтовый поток, связанный с именем integers.bin
        FileOutputStream fs = new FileOutputStream("integers.bin");
        //1.2 Создать байтовый поток содержащий методы чтения данных примитивных типов
        DataOutputStream ds = new DataOutputStream(fs);
        //1.3 Записать количество элементов в масиве - используется метод write
        ds.writeInt(arrayInt.length);
        //1.4 Записать массив целых чисел
        for (int i = 0; i <arrayInt.length ; i++) {
            ds.writeInt((int)arrayInt[i]);
        }
        //1.5 Закрыть файл integers.bin
        fs.close();
        //2. Считать массив целых чисел из байтового файла integers.bin
        int [] arrayInt2; // массив в который будут считаны данные из файла integers.bin
        //2.1 Создать файловый поток, связанный с именем integers.bin
        FileInputStream fs2 = new FileInputStream("integers.bin");
        //2.2 Создать поток данных, связаннный с файловым потоком fs2
        DataInputStream ds2 = new DataInputStream(fs2);
        //2.3 Считать количество целочисленных элементов, которые записаны в файле
        int count = ds2.readInt();
        //2.4 Выделить память для массива arrayInt2
        arrayInt2 = new int[count];
        //2.5 Цикл чтения данных из ds2 и копирование их в массив arrayInt2
        for (int i = 0; i < arrayInt2.length ; i++) {
            arrayInt2[i] = ds2.readInt();
        }
        //2.6 Закрыть поток ds2
        ds2.close();
        //3. Вывести массив arrayInt2 для контроля
        System.out.println("Array arrayInt2: ");
        for (int i = 0; i < arrayInt2.length ; i++) {
            System.out.println(arrayInt2[i]);

        }
    }
}
