package com.company;

public class Circle {
    private double radius;

    public Circle(double x) {
        radius = x;
    }

    public double area() {
        double a = Math.PI * Math.pow(radius, 2);
        return a;
    }

    public double circumference() {
        double c = 2 * Math.PI * radius;
        return c;
    }


}
