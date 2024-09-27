package com.example.myapplication;

public class Circle extends Shape {

    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementing area method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Implementing perimeter method
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Optional: Additional method to describe the shape
    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}