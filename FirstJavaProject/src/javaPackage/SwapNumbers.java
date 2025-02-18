/*Java program to interchange two numbers without using a third variable*/

package javaPackage;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        //int a = 10;
        //int b = 20;
        System.out.println("Enter number1: ");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
		System.out.println("Enter the number2: ");
		int b=scanner.nextInt();
		
       
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        
        // Swap without a third variable
        a = a + b; // a now becomes 30
        b = a - b; // b becomes 10 (original value of a)
        a = a - b; // a becomes 20 (original value of b)

        System.out.println("After swapping: a = " + a + ", b = " + b);
        scanner.close();
    }
}

