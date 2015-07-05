package ua.com.javaschool.homework.oop.lesson5.task1_2;


import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class FindFiles {

    // Модифицировать проект FindFiles так, чтобы программа искала в каталоге
    // все файлы с расширениями из списка
    static class MyFileFilter implements FilenameFilter {
        private String[] exts;

        public MyFileFilter(String[] exts) {
            this.exts = exts;
        }

        public boolean accept(File dir, String name) {
            for (String ext : exts){
                if (name.endsWith(ext))
                    return true;
            }
            return false;
        }
    }
    // Написать рекурсивную ф-ю для вывода на экран всех файлов и каталогов, имя которых
    // длиннее 5 символов и вторая буква равна ‘A’
    private static void findFilesInDirs(String srcPath, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles();
        if (files == null) return;
        for (File f : files) {
            if (f.isFile() && f.getName().length()>5 && f.getName().charAt(1)=='A') {
                list.add("File: " + f.getCanonicalPath());
            } else {
                findFilesInDirs(f.getCanonicalPath(), list);
            }
        }
    }

    private static void findFiles(String srcPath, String[] exts, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles(new MyFileFilter(exts));

        for (int i = 0; i < files.length; i++) {
            list.add(srcPath + files[i].getName());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String[] exts = {".txt", ".pdf", ".doc", ".xls"};

        try {
            findFilesInDirs("c:\\Users\\Adam", list);
            findFiles("c:\\Users\\Adam", exts, list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : list)
            System.out.println(s);
    }
}
