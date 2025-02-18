/*Factorial Program in Java: Factorial of n is the product of all positive descending integers. 
 * Factorial of n is denoted by n!. For example:
 4! = 4*3*2*1 = 24  
 5! = 5*4*3*2*1 = 120  */
//
//
package javaPackage;
//agb
import java.util.Scanner;

public class Factorial {
	public void FactorialUsingLoop(int number)
	{
		int i;
		int fact=1;
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of " +number +" using Loop is: " +fact);
	}
	public int FactorialRecursion(int number)
	{
		if(number==0||number==1)
		{
			return 1;
		}
		else
		{
			return number*(FactorialRecursion(number-1));
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scanner.nextInt();
		Factorial f=new Factorial();
		f.FactorialUsingLoop(number);
		int fact1=f.FactorialRecursion(number);
		System.out.println("Factorial of " +number +" using recursion is: " +fact1);
		scanner.close();
	}

}
