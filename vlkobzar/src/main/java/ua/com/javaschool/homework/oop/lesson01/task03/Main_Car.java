package ua.com.javaschool.homework.oop.lesson01.task03;

/**
 *Написать класс «автомобиль» Car, который должен
 уметь заводится on(), глушить мотор off(), ехать go() и
 держать необходимую скорость setSpeed(int speed).
 */
public class Main_Car {
    public static void main(String[] args) {
        try{
            final Car bmw = new Car("BMW", 500);
            final Car ferrari = new Car("Ferrari", 1000);
        bmw.turnOn();
            ferrari.turnOn();
            int [] speeds = {20, 60, 100};

            for (int s : speeds)
                bmw.strat(s, 0.5);
            for(int s : speeds)
                ferrari.strat(s,1);

            bmw.turnOff();
            ferrari.turnOff();

            System.out.println("Lesson_1.Cars count: " + Car.count);
            System.out.println(bmw.getName() + ": " + bmw.getMileage() + " : " + bmw.getFuel_consumption_BMW());
            System.out.println(ferrari.getName() + ": " + ferrari.getMileage() +  " : " + ferrari.getFuel_consumption_Ferrari());
        }catch (Exception ex){
            System.out.println("Error");
        }
    }
}
