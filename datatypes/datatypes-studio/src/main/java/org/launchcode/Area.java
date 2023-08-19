package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();

        double area = calculateCircleArea(radius);

        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        input.close();
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

