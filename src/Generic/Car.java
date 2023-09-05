package Generic;

public class Car {//implements Comparable<Car>{
    int price;
    int speed;
    String color;

    public Car() {
        // TODO Auto-generated constructor stub
    }

    public Car(int price, int speed, String color) {
        // TODO Auto-generated constructor stub
        this.price = price;
        this.speed = speed;
        this.color = color;
    }
    @Override
    public String toString(){
        return "P:" + this.price +" S:"+this.speed+" C:" + this.color;
    }

//    @Override
//    public int compareTo(Car o) {
////        return o.price - this.price;
////        return this.speed - o.speed;
//        return this.color.compareTo(o.color);
//    }
}
