package ua.com.javaschool.homework.oop.lesson02.task03;

/**
 Написать иерархию классов «Фигуры». Фигура ->
 Треугольник -> Прямоугольник -> Круг. Реализовать ф-ю
 подсчета площади для каждого типа фигуры.
 */
public class Main_Class {
    public static void main(String[] args) {
        System.out.println(Triangle.Name);
        Triangle t = new Triangle();
        System.out.println("Triangle square: " + t.getS() + "\n");

        System.out.println(Rectangle.Name);
        Rectangle r = new Rectangle();
        System.out.println("Square rectangle: " + r.getS() + "\n");

        System.out.println(Circle.NAME);
        Circle c1 = new Circle();
        System.out.println("Square circle: " + c1.getS() + "\n");
    }
}

