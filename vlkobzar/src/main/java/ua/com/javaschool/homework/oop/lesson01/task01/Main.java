package ua.com.javaschool.homework.oop.lesson01.task01;

/**
 *  Написать метод класса Rectangle, который будет
 *  возвращать площадь прямоугольника.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Rectangle.Name);
        Rectangle r = new Rectangle(0, 0);
        System.out.println("Square: " + r.square());
    }
}
