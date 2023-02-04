package com.company;

class Circle {
    private double radius = 1.0;
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
