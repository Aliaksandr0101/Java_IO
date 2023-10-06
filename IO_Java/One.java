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
                    System.out.println(item.getName() + " this folder");
                }else{
                    System.out.println(item.getName() + " this file");
                    System.out.println();
                }
            }
        }
    }
}
