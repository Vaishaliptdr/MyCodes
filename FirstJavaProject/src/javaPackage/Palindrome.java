/*Palindrome number in java: A palindrome number is a number that is same after reverse. 
 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
 * It can also be a string like LOL, MADAM etc.*/


package javaPackage;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String original,reverse="";                   //Objects of string class
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number/String to check Palindrome: ");
		original=scanner.nextLine();
		int lengthOfString=original.length();
		System.out.println("Length of the entered string:" +lengthOfString);
		for(int i=lengthOfString-1;i>=0;i--) 
			reverse=reverse+original.charAt(i);
			if(original.equals(reverse)) {
				System.out.println("Entered Number/String is Palindrome");
			}
			else {
				System.out.println("Entered Number/String is not Palindrome");
			}
		
		scanner.close();
	}

}
