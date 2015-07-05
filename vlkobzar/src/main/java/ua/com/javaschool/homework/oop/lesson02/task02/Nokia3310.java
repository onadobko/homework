package ua.com.javaschool.homework.oop.lesson02.task02;


public class Nokia3310 extends Phone{
    public Nokia3310(String number) {
        this.number = number;
    }

    @Override
    public void call(String number) {
        System.out.println(this.number + " is calling " + number);
        super.call(number);
    }

    @Override
    public void answer() {
        System.out.println("Nokia3310 is listening.");
    }
}
