package Lecture20;

public class Cars {
    private String color;
    private int price;
    private int speed;

    public Cars(String color, int price, int speed) {
        this.color = color;
        this.price = price;
        this.speed = speed;
    }

    public void Display() {
        System.out.println("Color : " + color + "\n price: " + price + "\n speed : " + speed);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        try{
            if(price<0){
                throw  new Exception("Can't be negatiave");
            }
            this.price = price;
        } catch (Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Hello");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
