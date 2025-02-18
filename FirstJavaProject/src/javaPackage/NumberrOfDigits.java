/* Finding the number of digits from number 
 * */

package javaPackage;

import java.util.Scanner;

public class NumberrOfDigits {

	public static void main(String[] args) {
		int digit=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int number=s.nextInt();
		
		while(number>0)
		{
			number=number/10;
			digit++;
		}
		System.out.println("Number of digits in given number are: "+digit);
		s.nextLine();      //This is imp Line
		System.out.println("Enter the value: ");
		String string = s.nextLine();
		System.out.println("You Entered: " +string);
		int lengthOfString=string.length();
		System.out.println("Length Of String is: " +lengthOfString);

		/*OR Method*/
		int count=String.valueOf("Sun").length();
		System.out.println("Number of digits in mentioned number are: "+count);
		int count1=String.valueOf(98768).length();
		System.out.println("Number of digits in mentioned number are: "+count1);
		s.close();

	}

}
