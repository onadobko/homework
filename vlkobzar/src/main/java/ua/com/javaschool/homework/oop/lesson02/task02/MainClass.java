package ua.com.javaschool.homework.oop.lesson02.task02;

/*
Написать код для связи телефонов между собой. У
каждого телефона будет свой номер. При вызове
call(x) телефон должен найти собеседника по
номеру x из всех доступных в данный момент
телефонов )из всех созданных объектов типа
Phone) и вызвать его метод answer().
 */
public class MainClass {

    public static void main(String[] args) {
        PhonesList phl= new PhonesList();

        Phone nokia = new Nokia3310("111-11-11");
        phl.add(nokia);
        Phone iphone = new IPhone("222-22-22");
        phl.add(iphone);
        Phone iphone5 = new IPhone5("333-33-33");
        phl.add(iphone5);
        Phone sumsung = new SamsungS4("444-44-44");
        phl.add(sumsung);

        nokia.call("222-22-22");
        iphone.call("333-33-33");
        iphone5.call("444-44-44");
        sumsung.call("111-11-11");
    }
}
