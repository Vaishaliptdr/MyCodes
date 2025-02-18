/*Write a Java Program to print numbers 1 to 100 without using any loop(for/while/do-while)*/

package javaPackage;

public class PrintNumbersWithoutLoop {
    public static void main(String[] args) {
        // Start the recursion from 1
        printNumbers(1);
    }

    public static void printNumbers(int number) {
        if (number <= 100) { // Base condition to stop recursion
            System.out.println(number);
            printNumbers(number + 1); // Recursive call with the next number
        }
    }
}

