/*Leap Year Example: A year is leap, if it is divisible by 4 and 400. But, not by 100. */

package javaPackage;

public class IfElse {

	public static void main(String[] args) {
		int LeapYear = 0;
		for(int year=2000;year<=2040;year++) {
			if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
				System.out.println("LEAP YEAR:" +year); 

				LeapYear=LeapYear+1;

			}  
			else{  
				System.out.println("COMMON YEAR:" +year);  
			}  

		}
		System.out.println("Total Leap Years are:" +LeapYear);
	}

}
