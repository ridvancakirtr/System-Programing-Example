package Exercises2_2;

public class Cylinder extends Circle {
    double height = 1.25;

    public Cylinder() {

    }

    public Cylinder(double radius) {
        super.setRadius(radius);
    }

    public Cylinder(double radius, double height) {
        this.height = height;
        super.setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public double calcVolume(){
        return super.getPI()*super.getRadius()*height;
    }

    public double calcSurfaceArea(){
        return 2*super.getPI()*Math.sqrt(super.getRadius())+height*(2*super.getPI()*super.getRadius());
    }
}
