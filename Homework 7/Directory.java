/*
Cid Dominique
Homework 7

Write a program that goes through your file system and produces a tree 
diagram of all of your directories. The methods in the File class will 
probably come in very handy. For a sample output, check out this 
webpage: http://www.computerhope.com/treehlp.htm
*/

import java.io.File;
import java.lang.StringBuilder;
 
 
public class Directory {

        public static void main(String[] args) {
                String path = "C:\\AMD";
                StringBuilder name = new StringBuilder(path + "\n");
                int num = 0;
               
                Directory fw = new Directory();
                  fw.map(path, name, num);
                  System.out.print(name.toString());
        }
 
        public void map(String path, StringBuilder name, int num) {
                File root = new File(path);
            File[] list = root.listFiles();
           
            for (File f : list) {
                if (f.isDirectory()) {
                        for (int i = 0; i < num; i++)
                                name.append("\t");
                        num++;
                        name.append("/     " + f.getName() + "\n");
                    map(f.getAbsolutePath(), name, num);
                }
                if (num > 0) num--;
            }
        }      
       

}