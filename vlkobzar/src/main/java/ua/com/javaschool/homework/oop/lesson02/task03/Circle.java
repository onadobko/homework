package ua.com.javaschool.homework.oop.lesson02.task03;

import java.util.Scanner;

public class Circle extends Figure{
    public static final String NAME = "Circle";
    private double r, pi;

    public Circle() {
        r = 2;
       pi = 3.14;
    }


    public double getPi() {
        return pi;
    }



    public double getR() {
        return r;
    }

    public double getS(){
        return r * r * pi;
    }
}
