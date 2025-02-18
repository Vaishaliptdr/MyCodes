/*User of Ternary Operator instead of If Else Statement*/

package javaPackage;

public class TernaryOperator {

	public static void main(String[] args) {
		int number=15;    
		//Using ternary operator  
		String output=(number%2==0)?"even number":"odd number";    
		System.out.println(output);  
	}

}
