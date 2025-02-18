/*An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits. 
 * It is also known as pluperfect, or Plus Perfect, or Narcissistic number. 
 * It is an OEIS sequence A005188.

Armstrong Number Example
1: 11 = 1

2: 21 = 2

3: 31 = 3

153: 13 + 53 + 33 = 1 + 125+ 27 = 153

125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643 */

package javaPackage;

import java.util.Scanner;

public class ArmstrongNumber {

	static boolean isArmstrong(int n) {
		int temp, digit=0, last=0, sum=0;
		temp=n;
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		
		temp=n;
		while(temp>0) {
			//determines the last digit from the number      
			last = temp % 10;   
			//calculates the power of a number up to digit times and add the resultant to the sum variable  
			sum += (int) Math.pow(last, digit);   
			//removes the last digit   
			temp = temp/10;   	
		}
		//compares the sum with limit  
		if(n==sum)   
			//returns if sum and limit are equal  
			return true;      
		//returns false if sum and limit are not equal  
		else return false;
	}

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		System.out.println("Enter the Limit:");
		int limit=scanner.nextInt();
		System.out.println("Armstrong Number up to "+ limit + " are: ");  
		
		for(int i=0; i<=limit; i++)  
			//function calling  
			if(isArmstrong(i))  
				//prints the armstrong numbers  
				System.out.print(i+ ", ");  


		System.out.println("\n\nEnter the number:");
		int number=scanner.nextInt();
		if(isArmstrong(number))  
		{  
			System.out.print("The number "+number +" is Armstrong ");  
		}  
		else   
		{  
			System.out.print("The number "+number +" is Not Armstrong ");  
		}  
		scanner.close();
	}

}
