package javaPackage;

public class Java_Operators {

	public static void main(String[] args) {
		/*Unary Operator Example: ++ and --*/
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10 

		int a=10;  
		int b=10;  
		System.out.println(a++ + ++a);//10+12=22  
		System.out.println(b++ + b++);//10+11=21

		/*Unary Operator Example: ~ and !*/
		int e=10;  
		int f=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~e);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~f);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true 

		/*Java Arithmetic Operator */
		int g=10;  
		int h=5;  
		System.out.println(g+h);//15  
		System.out.println(g-h);//5  
		System.out.println(g*h);//50  
		System.out.println(g/h);//2  
		System.out.println(g%h);//0 
		System.out.println(10*10/5+3-1*4/2);  


		/*Java Left Shift Operator*/
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240

		/*Java Right Shift Operator*/
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  

		/*Java Shift Operator Example: >> vs >>>*/
		//For positive number, >> and >>> works same  
		System.out.println(20>>2);  
		System.out.println(20>>>2);  
		//For negative number, >>> changes parity bit (MSB) to 0  
		System.out.println(-20>>2);  
		System.out.println(-20>>>2);  

		/* Java AND Operator Example: Logical && and Bitwise & */
		int i=10;  
		int j=5;  
		int k=20; 
		System.out.println(i<j&&i<j);//false && true = false  
		System.out.println(i<j&i<k);//false & true = false

		/*Java AND Operator Example: Logical && vs Bitwise &*/
		int l=10;  
		int m=5;  
		int n=20;  
		System.out.println(l<m&&l++<n);//false && true = false  
		System.out.println(l);//10 because second condition is not checked  
		System.out.println(l<m&l++<n);//false && true = false  
		System.out.println(l);//11 because second condition is checked 

		/*Java OR Operator Example: Logical || and Bitwise | */
		int o=10;  
		int p=5;  
		int q=20;  
		System.out.println(o>p||o<q);//true || true = true  
		System.out.println(o>p|o<q);//true | true = true  //|| vs |  
		System.out.println(o>p||o++<q);//true || true = true  
		System.out.println(o);//10 because second condition is not checked  
		System.out.println(o>p|o++<q);//true | true = true  
		System.out.println(o);//11 because second condition is checked 

		/*Java Ternary Operator Example
		 * A ternary operator evaluates the test condition and executes a block of 
		 * code based on the result of the condition. if condition is true , expression1 is executed. 
		 * And, if condition is false , expression2 is executed.*/
		int r=2;  
		int s=5;  
		int t=(r<s)?r:s;  
		System.out.println(t);  
		int u=(s<r)?r:s;  
		System.out.println(u);  


	}

}
