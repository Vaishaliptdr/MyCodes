/* Swap two string using temp variable*/

package javaPackage;

import java.util.Scanner;

public class SwapString {
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

        // Swap using a temporary variable
        String temp = firstString;
        firstString = secondString;
        secondString = temp;

        // Display strings after swapping
        System.out.println("After swapping:");
        System.out.println("First String: " + firstString);
        System.out.println("Second String: " + secondString);
        scanner.close();
    }
}
