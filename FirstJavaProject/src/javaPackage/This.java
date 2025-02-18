//In this program, we are printing the reference variable and this, output of both variables are same.
package javaPackage;

public class This {

	void method()
	{
		System.out.println(this);
	}
	public static void main(String[] args) 
	{
		This a=new This();
		This b=new This();
		System.out.println(a);
		a.method();
		System.out.println(b);
		b.method();

	}

}
