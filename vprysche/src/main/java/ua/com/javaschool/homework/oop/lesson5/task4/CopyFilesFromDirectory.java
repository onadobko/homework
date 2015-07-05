package ua.com.javaschool.homework.oop.lesson5.task4;

import java.io.*;


public class CopyFilesFromDirectory {
    //Написать программу для копирования всех файлов из одного каталога в другой.

    public static void main(String[] args) {
        String source = "c:\\source_dir";
        String destination = "c:\\destination_dir";
        try {
            copyFromDir(source,destination);
        }
        catch (IOException e){
            System.out.println("OOPS!!! Something goes wrong!");
            e.printStackTrace();
        }
    }

    public static void copyFromDir(String source, String destination) throws IOException{
        File src = new File(source);
        File dest = new File(destination);
        File[] files = src.listFiles();
        if (src.isDirectory()){
            if (!dest.exists()){
                dest.mkdir();
            }
        }
        for (File file:files){
            InputStream is = new FileInputStream(file);
            OutputStream os = new FileOutputStream(dest+"/"+file.getName());
            byte[] buffer = new byte[1024];
            int length;
            while ((length=is.read(buffer))>0){
                os.write(buffer,0,length);
            }
            is.close();
            os.close();
        }
        System.out.println("Copy finished!");
    }
}
