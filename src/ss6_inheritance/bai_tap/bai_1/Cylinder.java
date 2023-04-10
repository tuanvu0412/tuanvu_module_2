package ss6_inheritance.bai_tap.bai_1;

import ss6_inheritance.bai_tap.bai_1.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public Cylinder(){
        super();
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(){
        this.height = height;

    }
    public  double getTotalArea(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return getTotalArea()+"";
    }
}
