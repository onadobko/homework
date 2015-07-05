package ua.com.javaschool.homework.oop.lesson02.task02;

public class IPhone extends Phone {

    public IPhone() {
    }

    public IPhone(String number) {
        this.number = number;
    }

    @Override
    public void call(String number) {
        System.out.println(this.number + " is calling " + number);
        super.call(number);
    }

    @Override
    public void answer() {
        System.out.println("IPhone is listening.");
    }
}