package org.launchcode;

public class Circle {
    public static Double getArea(Double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Double radius = 5.0;
        Double area = getArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
