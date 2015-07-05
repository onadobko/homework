package ua.com.javaschool.homework.oop.lesson02.task01;


public class MainClass {
/*
Написать класс наследник SamsungS4 с диагональю
экрана 5 дюймов, поддержкой Wifi и методом отправки
SMS, который будет дописывать к сообщению слово
“Hello”.
 */
    public static void main(String[] args) {


        Nokia3310 nokia = new Nokia3310();
        System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
        nokia.call("123-45-67");
        nokia.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        IPhone iphone = new IPhone();
        System.out.println("IPhone screent size: " + iphone.getScreenSize());
        iphone.call("123-45-67");
        iphone.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        IPhone5 iphone5 = new IPhone5();
        System.out.println("IPhone screent size: " + iphone5.getScreenSize());
        iphone5.call("123-45-67");
        iphone5.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        SamsungS4 samsung  = new SamsungS4();
        System.out.println("SamsungS4 screen size: " + samsung.getScreenSize());
        samsung.call("123-34-53");
        samsung.sendSMS("567-12-53", "textmassage");

    }
}
