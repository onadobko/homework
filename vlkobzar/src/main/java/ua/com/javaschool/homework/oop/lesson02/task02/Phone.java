package ua.com.javaschool.homework.oop.lesson02.task02;

public abstract class Phone {

    protected String number;

    public String getNumber() {
        return number;
    }

    public void call(String number) {
        PhonesList.find(number).answer();
    }

    public abstract void answer();
}