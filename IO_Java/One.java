package IO_Java;



import org.w3c.dom.ls.LSOutput;

import java.io.File;

public class One {
    public static void main(String[] args) {
        String thePathToTheFile = "C:\\Users\\user\\Desktop\\OverOne\\ExampleThreeJavaIO";
        File dir = new File(thePathToTheFile);
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()){
                if (item.isDirectory()) {
                    System.out.println(item.getName() + " - This is the name of the folder inside the first folder.\n");
                    for (File elementInsideItem : item.listFiles()) {
                        System.out.println(elementInsideItem.getName() + " - This is the name of the file inside the second folder.\n");
                    }
                }else{
                    System.out.println(item.getName() + " - This is the name of the file inside the first folder.\n");
                }
            }
        }
    }
}
