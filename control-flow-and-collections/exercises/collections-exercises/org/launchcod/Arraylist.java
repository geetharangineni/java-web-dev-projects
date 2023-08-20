package org.launchcod;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {


        public static int sumOfEvenNumbers(ArrayList<Integer> numbers) {
            int sum = 0;
            for (int num : numbers) {
                if (num % 2 == 0) {
                    sum += num;
                }
            }
            return sum;
        }

        public static void printWordsWithLength(ArrayList<String> words, int length) {
            for (String word : words) {
                if (word.length() == length) {
                    System.out.println(word);
                }
            }
        }

        public static void main(String[] args) {
            ArrayList<Integer> integerList = new ArrayList<>();
            integerList.add(2);
            integerList.add(5);
            integerList.add(12);
            integerList.add(8);
            integerList.add(7);
            integerList.add(6);
            integerList.add(10);
            integerList.add(3);
            integerList.add(9);
            integerList.add(4);

            int evenSum = sumOfEvenNumbers(integerList);
            System.out.println("Sum of even numbers: " + evenSum);

            ArrayList<String> wordList = new ArrayList<>();
            wordList.add("apple");
            wordList.add("banana");
            wordList.add("cherry");
            wordList.add("grape");
            wordList.add("mango");
            wordList.add("kiwi");
            wordList.add("Apricot");
            wordList.add("peach");
            wordList.add("plum");
            wordList.add("orange");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter word length for search: ");
            int searchLength = scanner.nextInt();

            System.out.println("Words with length " + searchLength + ":");
            printWordsWithLength(wordList, searchLength);
        }
    }


