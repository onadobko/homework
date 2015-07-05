package ua.com.javaschool.homework.oop.lesson02.task01;
/*
�������������� ����� Phone ���, ����� �� ������
���������� ������� � ��������� �������� ���
������� �������.
 */

public abstract class Phone {

    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize, Call_Count, Massage_Count;

    public Phone() {
        System.out.println("Phone constructor");
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void call(String number) {
        Call_Count++;
        System.out.println("Phone class is calling " + number);
        System.out.println("Quantity of calls is: " + Call_Count);
    }

    public void sendSMS(String number, String message){
        Massage_Count++;
        System.out.println("Phone calss is sending message: " + message + " to " + number);
        System.out.println("Quantity of message is: " + Massage_Count);
    };
}