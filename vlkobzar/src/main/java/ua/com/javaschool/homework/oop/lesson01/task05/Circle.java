package ua.com.javaschool.homework.oop.lesson01.task05;

import java.util.Scanner;

/**
 Написать класс Circle (круг) по аналогии с
 Rectangle и метод, который будет возвращать его
 площадь.
 */
public class Circle {
    public static final String NAME = "Circle";
    private double r, pi;

    public Circle(double r, double pi){

        Scanner sc = new Scanner(System.in);
        System.out.println("Pi = 3.14");
        System.out.println("Enter radius:");
        this.r = sc.nextInt();
        this.pi = 3.14;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getPi() {
        return pi;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double square(){
        return r * r * pi;
    }
}
