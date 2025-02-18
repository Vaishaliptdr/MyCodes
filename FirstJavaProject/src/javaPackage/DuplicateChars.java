/*Write a program to find duplicate characters in a given String. Print string */

package javaPackage;

import java.util.Scanner;

public class DuplicateChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Duplicate characters in the string:");
        findDuplicates(input);

        scanner.close();
    }

    public static void findDuplicates(String str) {
        str = str.toLowerCase(); // Convert to lowercase to make it case-insensitive (optional)
        int[] charCounts = new int[256]; // Array to store character counts (ASCII values)
        StringBuilder uniqueString = new StringBuilder(); // To store unique characters
        StringBuilder duplicateChars = new StringBuilder(); // To store duplicate characters

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCounts[c]++;
        }

        // Print duplicate characters and count
        boolean hasDuplicates = false;
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 1) {
                duplicateChars.append((char) i); // Append duplicate characters
                System.out.println((char) i + " -> " + charCounts[i]);
                hasDuplicates = true;
            }

            // Add unique characters to uniqueString
            if (charCounts[i] > 0) {
                uniqueString.append((char) i);
            }
        }

        // Remove duplicates from the unique string
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < uniqueString.length(); i++) {
            char c = uniqueString.charAt(i);
            if (finalString.indexOf(String.valueOf(c)) == -1) {
                finalString.append(c); // Add only unique characters
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate characters found.");
        }

        // Print the string without duplicate characters
        System.out.println("String without duplicate characters: " + finalString.toString());
    }
}
