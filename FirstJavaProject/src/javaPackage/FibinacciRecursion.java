//Fibonacci Series of 10 numbers with Recursion

package javaPackage;

import java.util.Scanner;

public class FibinacciRecursion {
	static int n1=0, n2=1,n3=0;
	static void printFibonacci(int count) {
		if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFibonacci(count-1);
		}

	} 
	public static void main(String[] args) {
		System.out.println("Enter count for fibonacci series: ");
        Scanner scanner=new Scanner(System.in);
        int count =scanner.nextInt();
		System.out.print(n1+" "+n2);

		printFibonacci(count-2);
		scanner.close();

	}

}
