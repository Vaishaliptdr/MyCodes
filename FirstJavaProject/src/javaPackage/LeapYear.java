/*Write a program to check whether the year is leap or not
 * A year is a leap year if:
It is divisible by 4, and
It is not divisible by 100 unless it is also divisible by 400.*/

package javaPackage;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year from user
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }

    
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4,
        // but not divisible by 100 unless it is also divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}

