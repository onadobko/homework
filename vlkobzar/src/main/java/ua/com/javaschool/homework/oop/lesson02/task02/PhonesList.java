package ua.com.javaschool.homework.oop.lesson02.task02;

public class PhonesList {
    private static Phone[] list = new Phone[100];
    private static int p = 0;

    public void add(Phone ph) {
        list[p++] = ph;
    }

    public static Phone find(String number) {
        for (int i = 0; i < p; i++) {
            if (list[i].getNumber().equals(number))
                return list[i];
        }
        return list[-1];
    }
}