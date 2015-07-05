package ua.com.javaschool.homework.oop.lesson02.task02;

public class IPhone5 extends IPhone {

    public IPhone5(String number) {
        this.number = number;
    }

    @Override
    public void answer() {
        System.out.println("IPhone5 is listening.");
    }
}