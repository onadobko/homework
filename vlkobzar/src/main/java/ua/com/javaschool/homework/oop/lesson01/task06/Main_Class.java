package ua.com.javaschool.homework.oop.lesson01.task06;
import java.util.Scanner;

/**
 * Описать класс «Vector3D» (т.е. он должен описывать вектор в
 3-х мерной, декартовой системе координат). В качестве
 свойств этого класса возьмите координаты вектора. Для этого
 класса реализовать методы сложения, и скалярного и
 векторного произведения векторов. Создайте несколько
 объектов этого класса и протестируйте их.
 */
public class Main_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();

        Point p1 = new Point(x1, z1, y1);
        Point p2 = new Point(x2, y2, z2);

        System.out.println("Distance = " + p1.distanceTo(p2));
    }
}
