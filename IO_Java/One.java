package IO_Java;

import java.io.File;

public class One {
    public static void main(String[] args) {
        // Замените путь на путь к вашей выбранной папке
        String folderPath = "C:\\Users\\user\\Desktop\\OverOne\\ExampleThreeJavaIO";

        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            File[] filesAndDirectories = folder.listFiles();

            if (filesAndDirectories != null) {
                for (File fileOrDir : filesAndDirectories) {
                    String name = fileOrDir.getName();
                    long length = fileOrDir.length();
                    boolean isDirectory = fileOrDir.isDirectory();

                    System.out.println("Название: " + name);
                    System.out.println("Длина: " + length + " байт");
                    System.out.println("Принадлежит к директории: " + isDirectory);
                    System.out.println();
                }
            } else {
                System.out.println("Папка пуста.");
            }
        } else {
            System.out.println("Указанная папка не существует или не является директорией.");
            System.out.println("Указанная папка не существует или не является директорией.");
            
        }
    }
        }


