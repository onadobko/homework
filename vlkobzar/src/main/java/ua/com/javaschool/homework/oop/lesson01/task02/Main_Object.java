package ua.com.javaschool.homework.oop.lesson01.task02;

/**
 * Написать класс, который умеет считать количество
 созданных объектов этого класса (подсказка: нужно
 прибегнуть к static).
 */
public class Main_Object {
    public static void main (String [] args){
        System.out.println(Object.count);

        int n = 5;
        while (n --> 0)
            new Object();
        System.out.println(Object.count);
    }
}
