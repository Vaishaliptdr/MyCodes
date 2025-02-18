/*Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. 
 * In other words, prime numbers can't be divided by other numbers than itself or 1. 
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers 
can be divided by 2.* */

package javaPackage;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to check
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Assume number is prime unless proven otherwise
        boolean isPrime = true;

        // A prime number is greater than 1 and has no divisors other than 1 and itself
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
