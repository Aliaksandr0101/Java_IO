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
                    System.out.printf("\n%s - name of the folder inside the first folder. Folder size = %d байт.\n",
                            item.getName(), item.length());
                    for (File elementInsideItem : item.listFiles()) {
                        System.out.printf("%s - name of the file inside the first folder. File size = %d байт.\n",
                                elementInsideItem.getName(), elementInsideItem.length());
                    }
                }else{
                    System.out.printf("%s - name of the file inside the first folder. File size = %d байт.\n",
                            item.getName(), item.length());

                }
            }
        }
    }
}
