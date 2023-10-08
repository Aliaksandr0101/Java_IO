package IO_Java;

import java.io.File;

public class ExampleThree {
    public static void main(String[] args) {
        String thePathToTheFile = "C:\\Users\\user\\Desktop\\OverOne\\ExampleThreeJavaIO";
        File dir = new File(thePathToTheFile);
        if (dir.isDirectory() & dir.exists()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.printf("\n%s - name of the folder inside the first folder. Folder size = %d байт.\n",
                            item.getName(), item.length());
                    System.out.println("Belongs to the directory: " + item.isDirectory() + "\n");
                    for (File elementInsideItem : item.listFiles()) {
                        System.out.printf("%s - name of the file inside the first folder. File size = %d байт.\n",
                                elementInsideItem.getName(), elementInsideItem.length());
                        System.out.println("Belongs to the directory: " + elementInsideItem.isDirectory() + "\n");
                    }
                } else {
                    System.out.printf("%s - name of the file inside the first folder. File size = %d байт.\n",
                            item.getName(), item.length());
                    System.out.println("Belongs to the directory: " + item.isDirectory() + "\n");
                }
            }
        }
    }
}
