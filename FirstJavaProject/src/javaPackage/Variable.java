package javaPackage;

public class Variable {
	static int f = 3;                  //Static variable
	String x= "Hello";                 //Instance Variable
	
	public static void main(String[] args) {

		int a = 12;                    //Local Variable
		float b = a;                   //Widening Example
		System.out.println(a);
		System.out.println("After Widening the value of b: "+b);

		float c = 13.7f;
		int d = (int)c;                //Narrowing (Type casting) Example
		System.out.println(c);
		System.out.println("After Narrowing the value of d: "+d);
		System.out.println(f);
//		System.out.println(x);
		
	}

}
