package ua.com.javaschool.homework.oop.lesson02.task03;



public class Rectangle extends Figure {
    public static final String Name = "Rectangle";
    private int width, heigth;
    public Rectangle() {
        width = 1;
        heigth = 5;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getWidth() {
        return width;
    }

    public double getS(){
        return heigth * width;
    }
    }