/*Write a Java Program to print the sum of digits of a given integer*/

package javaPackage;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the integer from the user
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = calculateSumOfDigits(Math.abs(number)); // Use Math.abs to handle negative numbers

        // Display the result
        System.out.println("The sum of the digits is: " + sum);
        scanner.close();
    }

    public static int calculateSumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10; // Extract the last digit and add to the sum
            num /= 10;       // Remove the last digit
        }

        return sum;
    }
}

