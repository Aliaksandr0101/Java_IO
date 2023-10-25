package IO_Java;

public class ExampleFive {
    public static void main(String[] args) {
        // Укажите путь к файлу, который вы хотите обработать
        String filePath = "путь_к_вашему_файлу.txt";

        try {
            // Чтение данных из файла
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

            // Запись количества букв "а" обратно в файл
            FileWriter writer = new FileWriter(filePath);
            writer.write("Количество букв 'а' в файле: " + aCount);
            writer.close();

            System.out.println("Количество букв 'а' в файле: " + aCount);
            System.out.println("Данные успешно записаны обратно в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
