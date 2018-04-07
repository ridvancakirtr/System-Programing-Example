package Exercises2_2;

public class Circle {
    private double radius = 0.75;
    private String color = "blue";
    private double PI = 3.14;

    public Circle() {
    }

    public Circle(double PI) {
        this.PI = PI;
    }

    protected double getRadius() {
        return radius;
    }

    protected String getColor() {
        return color;
    }

    protected double getPI() {
        return PI;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }
}
