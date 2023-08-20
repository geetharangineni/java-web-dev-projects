package org.launchcod;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Initialize an array with the given values
        int[] numbers = {1, 1, 2, 3, 5, 8};

        // Loop through and print all values
        System.out.println("All numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // New line

        // Loop through and print only odd numbers
        System.out.println("Odd numbers:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // New line

        // Split the given string into words
        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = text.split(" ");

        // Print the array of words
        System.out.println("Array of words:");
        System.out.println(Arrays.toString(words));
    }
}



