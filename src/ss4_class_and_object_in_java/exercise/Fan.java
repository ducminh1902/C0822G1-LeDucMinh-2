package ss4_class_and_object_in_java.exercise;

public class Fan {
    final int SLOW =1;
    final int MEDIUM =2;
    final int FAST =3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color  = "blue";

    public  Fan(){

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if (isOn()){
          return  "fan is on "+this.speed+" "+this.color+" "+this.radius;
        }else {
          return  "fan is off "+this.color+" "+this.radius;
        }
    }
}
