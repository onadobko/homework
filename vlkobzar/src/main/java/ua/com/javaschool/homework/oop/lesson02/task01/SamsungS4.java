package ua.com.javaschool.homework.oop.lesson02.task01;


public class SamsungS4 extends Phone{
        public SamsungS4() {
                System.out.println("SamsungS4 constructor");
                screenSize = 5;
                touch = true;
                hasWifi = true;
        }
        @Override
        public void call(String number) {
                super.call(number);
                System.out.println("SamsungS4 class is calling " + number);
        }

        @Override
        public void sendSMS(String number, String message) {
                String  s = "'Hello'";
                System.out.println("SamsungS4 class is sending sms " + s + " " + message + " to " + number);
        }
}



