package ua.com.javaschool.homework.oop.lesson01.task03;



public class Engine {
    protected double mileage = 0, fuel_consumption_Ferrari = 0, fuel_consumption_BMW = 0;
    protected boolean started;

    public Engine(double mileage){
        this.mileage = mileage;
    }
    public double getFuel_consumption_Ferrari(){
        return  fuel_consumption_Ferrari;
    }
    public double getFuel_consumption_BMW(){
        return  fuel_consumption_BMW;
    }
    public  double getMileage(){
        return mileage;
    }

    public void addMileage(double mileage){
        if(started)
            this.mileage +=mileage;
    }
    public void addFuel_consumption_Ferrari(double fuel_consumption_Ferrari){
        if(started)
            this.fuel_consumption_Ferrari += fuel_consumption_Ferrari;
    }
    public void addFuel_consumption_BMW(double fuel_consumption_BMW){
        if(started)
            this.fuel_consumption_BMW += fuel_consumption_BMW;
    }
    public boolean isStarted(){
        return started;
    }

    public void turnOn(){
        started = true;
    }

    public void turnOff(){
        started = false;
    }

  }

