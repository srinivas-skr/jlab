package srini;

import java.util.*;
    // First interface representing a shape
    interface Shape {
        double Area();
    }

    // Second interface representing a color
    interface Color {
        String Color();
    }

    // Concrete class Circle implementing Shape and Color interfaces
    class Circle implements Shape, Color {
        private double radius;
        private String color;

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        @Override
        public double Area() {
            return Math.PI * radius * radius;
        }

        @Override
        public String Color() {
            return color;
        }
    }

    public class multi {
        public static void main(String[] args) {
            Circle ob = new Circle(5.0, "Red");
            System.out.println("Circle Area: " + ob.Area());
            System.out.println("Circle Color: " + ob.Color());
        }
    }