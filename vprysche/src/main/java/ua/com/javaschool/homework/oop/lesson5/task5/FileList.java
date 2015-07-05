package ua.com.javaschool.homework.oop.lesson5.task5;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;

public class FileList {

    // Написать программу, которая создаст текстовый файл и запишет в него
    // список файлов (путь, имя, дата создания) из заданного каталога.
    public static void main(String[] args) {
        String source = "c:\\source_dir";
        try{
            makeFileList(source);
        }
        catch (IOException e){
            System.out.println("OOPS!!! Something goes wrong!");
        }

    }
    public static void makeFileList(String source) throws IOException{
        File src = new File(source);
        File[] files = src.listFiles();
        ArrayList<String> list_files = new ArrayList<String>();
        for (int i = 0; i<files.length; i++){
            list_files.add(source+"\\"+files[i].getName()+", Last modified: "+new Date(files[i].lastModified()));
        }
        RandomAccessFile raf = new RandomAccessFile(source+"\\file_list.txt", "rw");
        try{
            for (String s:list_files){
                raf.writeChars(s+String.format("%n"));
                System.out.println(s);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            raf.close();
        }


    }
}
