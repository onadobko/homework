package ua.com.javaschool.homework.oop.lesson02.task03;

import java.util.Scanner;

public class Triangle extends Figure {
    public static final String Name = "Triangel";
    private int a, b, c;



    public Triangle() {
        a = 1;
        b = 2;
        c = 3;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getS(){
        return a * b * c;
    }
}