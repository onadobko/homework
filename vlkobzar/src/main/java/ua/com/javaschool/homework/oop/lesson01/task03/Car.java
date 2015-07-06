package ua.com.javaschool.homework.oop.lesson01.task03;


public class Car {
    static public int count = 0;
    protected String name;
    protected Engine engine;

    public Car(String name){
        this.name = name;
        engine = new Engine(0);
        count++;
    }

    public  Car(String name, double mileage){
        this.name = name;
        engine = new Engine(mileage);
        count++;
    }

    public String getName(){
        return name;
    }
    public double getMileage(){
        return  engine.getMileage();
    }
    public double getFuel_consumption_Ferrari(){
      return   engine.getFuel_consumption_Ferrari();
    }
    public double getFuel_consumption_BMW(){
        return   engine.getFuel_consumption_BMW();
    }
    public  void turnOn(){
        engine.turnOn();
    }
    public  void turnOff(){
        engine.turnOff();
    }

    public  void strat(int speed, double hours){
        if ( ! engine.isStarted())
            return;
        final double Ferrari = 0.2, BMW = 0.15;

        double distance = hours * speed;

        engine.addMileage(distance);
        double fuel_F = distance * Ferrari, fuel_B = distance * BMW;
        engine.addFuel_consumption_Ferrari(fuel_F);
        engine.addFuel_consumption_BMW(fuel_B);
    }
}
