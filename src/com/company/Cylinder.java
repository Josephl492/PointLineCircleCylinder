package com.company;
    /*
Cylinder should have 2 attributes, a base of type Circle and a height (double)
Constructor should take 2 args, height and radius and initialize the attributes. Don’t forget to
use new to create the circle.
Methods that return the volume (vol) and surface area (sa) (both double). These methods
should not take arguments, but should use the class attributes to compute.
Use the CylinderTester class provided to test your classes. Check your work with a calculator.
    */
public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double x, double y) {
        base = new Circle(x);
        height = y;
    }

    public double vol() {
        double v = this.base.area() * this.height;
        return v;
    }

}
