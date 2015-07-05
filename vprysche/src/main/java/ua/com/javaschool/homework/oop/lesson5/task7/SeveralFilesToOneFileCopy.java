package ua.com.javaschool.homework.oop.lesson5.task7;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SeveralFilesToOneFileCopy {
    // Написать программу, которая скопирует несколько файлов в один.
    // Подумать как для этого использовать java.io.SequenceInputStream.

    public static void main(String[] args) {
        String[] paths = {"c:\\SomeFilesToOne\\1.txt", "c:\\SomeFilesToOne\\2.txt", "c:\\SomeFilesToOne\\3.txt", "c:\\SomeFilesToOne\\4.txt", "c:\\SomeFilesToOne\\5.txt"};
        String dest = "c:\\SomeFilesToOne\\Combined.txt";
        try {
            filesTextToString(paths, dest);
            System.out.println("Files combined to one file");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void filesTextToString(String[] paths, String dest) throws IOException{
        Vector<FileInputStream > files = new Vector();
        for (String path:paths){
            files.add(new FileInputStream(new File(path)));
        }
        Enumeration<FileInputStream> enumeration = files.elements();
        SequenceInputStream sis = new SequenceInputStream(enumeration);
        OutputStream os = new FileOutputStream(dest);
        try{
            byte[] buffer = new byte[sis.available()];
            int length;
            while ((length = sis.read(buffer))!=-1){
                try {
                    os.write(buffer, 0, length);

                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sis.close();
            os.close();

        }
    }

}


