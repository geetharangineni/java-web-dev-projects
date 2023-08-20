package org.launchcod;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class GradebookHashMap {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Map<Integer, String> gradebook = new HashMap<>();

            while (true) {
                System.out.print("Enter student ID (or -1 to stop): ");
                int id = scanner.nextInt();
                if (id == -1) {
                    break;
                }

                System.out.print("Enter student name: ");
                scanner.nextLine(); // Consume the newline character
                String name = scanner.nextLine();

                gradebook.put(id, name);
            }

            System.out.println("\nGradebook Roster:");
            for (Map.Entry<Integer, String> entry : gradebook.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        }
    }


