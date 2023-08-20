package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Countingcharacters {
    public static void main(String[] args) {
            String inputString = "Hello, world!";
            Map<Character, Integer> characterCountMap = new HashMap<>();

            for (char c : inputString.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
                }
            }

            System.out.println("Character Counts:");
            for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
                System.out.println("'" + entry.getKey() + "': " + entry.getValue());
            }
        }
    }

