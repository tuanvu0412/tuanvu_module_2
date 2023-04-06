package ss4_oop_java.bai_tap.Fan;

public class Fan {
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;

    }

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    public int speed = 1;
    public boolean on = false;
    public double radius = 5;
    public String color = "blue";

    public int getSlow() {
        return SLOW;
    }

    public int getMedium() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on == false) {
            return color + " " + radius + " " + " fan is off";
        } else {
            return speed + " " + color + radius + " " + " fan is on";
        }
    }

}


