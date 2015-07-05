package ua.com.javaschool.homework.oop.lesson01.task04;
import java.util.Scanner;

/**
 * Created by ������ on 02.07.2015.
 */
public class Triangle {
    public static final String Name = "Triangel`s";
    private int a, b, c;
    public Triangle(int a, int b, int c){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type side triangle");
        this.a = sc.nextInt();
        this.b = sc.nextInt();
        this.c = sc.nextInt();
    }
   public Triangle (){
       a = 1;
       b = 2;
       c = 3;
   }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public int square(){
        return a*b*c;
    }

}
