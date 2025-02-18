/*Swap two string without using temp variable*/

package javaPackage;

import java.util.Scanner;

public class SwapStringWithoutTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.println("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Display strings before swapping
        System.out.println("Before swapping:");
        System.out.println("First String: " + firstString);
        System.out.println("Second String: " + secondString);

        // Swap without using a temporary variable
        firstString = firstString + secondString; // Concatenate both strings
        secondString = firstString.substring(0, firstString.length() - secondString.length()); // Extract original first string
        firstString = firstString.substring(secondString.length()); // Extract original second string

        // Display strings after swapping
        System.out.println("After swapping:");
        System.out.println("First String: " + firstString);
        System.out.println("Second String: " + secondString);
        scanner.close();
    }
}

