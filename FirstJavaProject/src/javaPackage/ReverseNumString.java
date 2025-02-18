/*Java code which differentiate between string and number and accordingly select the function to reverse that.
 * */
package javaPackage;

import java.util.Scanner;

public class ReverseNumString {
	public static void reverseNumber(int n) {
	if(n<10) {
	System.out.println(n);
	return;
	}
	else {
		System.out.print(n%10);
		reverseNumber(n/10);
	}
	
	}
	
	public static void reverseString(String s) {
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter number or String: ");
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		
		// Check if the input is a number or string
        if (input.matches("\\d+")) {  // If input contains only digits
            int number = Integer.parseInt(input);  // Convert input to integer
            System.out.println("Entered number is: " +number);
            System.out.print("Reversed Number: ");
            reverseNumber(number);
        } else {  // If input contains letters or other characters
        	System.out.println("Entered String is: "+input);
            System.out.print("Reversed String: ");
            reverseString(input);
        }
		
		scanner.close();
		
		

	}

}
