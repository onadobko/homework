package ua.com.javaschool.homework.oop.lesson01.task04;

/**
 * ������� ����� �Triangle�. � �������� ������� �������� ������
 * ������ ������������. ���������� ����� ������� �����
 * ���������� ������� ����� ������������. �������� ���������
 * �������� ����� ������ � ������������� ��.
 */
public class Main_Triangle {
    public static void main(String[] args) {
        System.out.println(Triangle.Name);
        Triangle t1 = new Triangle(0,0,0);
        Triangle t2 = new Triangle(0,0,0);
        System.out.println("Square triangle number 1: " + t1.square());
        System.out.println("Square triangle number 2: " + t2.square());

        Triangle t3 = new Triangle();
        System.out.println("Square triangle number 3: " + (t3.getA()* t3.getB() * t3.getC()));
    }
}
