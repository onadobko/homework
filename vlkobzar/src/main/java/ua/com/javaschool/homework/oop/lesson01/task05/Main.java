package ua.com.javaschool.homework.oop.lesson01.task05;


public class Main {
    public static void main(String[] args) {
        System.out.println(Circle.NAME);
        Circle c = new Circle(0,0);
        System.out.println("Square circle: " + c.square());
    }
}
