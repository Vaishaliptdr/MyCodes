package javaPackage;

public class ExceptionHandling {

	public static void main(String[] args) {
		int x=10;
		try {
			System.out.println(x/0);
		} catch (Exception e) {
			//System.out.println(e);         //Printing: java.lang.ArithmeticException: / by zero
			e.printStackTrace();             //Printing:java.lang.ArithmeticException: / by zero
			                                 //at javaPackage.ExceptionHandling.main(ExceptionHandling.java:8)
			//System.out.println("Can not divide by zero");  //Printing: Custom Message
		}  //Catch block can be empty
		System.out.println(x);

	}

}
