package ua.com.javaschool.homework.oop.lesson01.task06;


public class Point {
    int x;
    int y;
    int z;
    public  Point (int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }
    public int distanceTo(Point another){
        return (int) Math.sqrt(
                Math.pow(another.x - x, 2) +
                        Math.pow(another.y - y, 2)+
                        Math.pow(another.z - z, 2)

        );
    }
}
