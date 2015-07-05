package ua.com.javaschool.homework.oop.lesson5.task3_6;


import java.io.*;

public class TextReplace {
    // Написать программу, которая считает текстовый файл, заменит в нем все
    // слова “Hello” на “1234” и запишет изменения в тот-же файл.

    // Разобраться с java.io.BufferedInputStream и java.io. BufferedOutputStream.
    // Подумать как улучшить программу №3 с помощью этих классов.
    public static void main(String[] args) {
        String path = "c:\\hello.txt";
        try {
            String text = fileTextToString(path);
            text = text.replace("Hello", "1234");
            writeFile(path,text);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public static String fileTextToString(String path) throws IOException{
        InputStream is = new FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(is);
        try{
            byte[] buffer = new byte[bis.available()];
            int length;
            while ((length = bis.read(buffer))>0){
                return new String(buffer, 0 , length);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            is.close();
            bis.close();
        }
        return null;

    }

    public static void writeFile(String path, String text) throws IOException{
        OutputStream os = new FileOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(os);
        try {
            byte[] buffer = text.getBytes();
            bos.write(buffer);
            bos.flush();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            os.close();
            bos.close();
        }

    }
}
