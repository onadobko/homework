package ua.com.javaschool.homework.oop.lesson02.task02;


public class SamsungS4 extends Phone {

    public SamsungS4(String number) {
        this.number = number;
    }

    @Override
    public void call(String number) {
        System.out.println(this.number + " is calling " + number);
        super.call(number);
    }

    @Override
    public void answer() {
        System.out.println("SumsungS4 is listening...");
    }
}