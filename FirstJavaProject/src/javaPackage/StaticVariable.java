package javaPackage;

class Student{
	int roll;
	static String college="MET"; 
	String name;

	//Parameterized Constructor
	Student(int i, String a)
	{
		roll=i;
		name=a;
	}
	static void change() {
		college="DYP";
	}

	public void display() {
		System.out.println("Student Info: " +roll+ " " +name+ " " +college+ " ");
	}
	static {
		System.out.println("Static block got executed before main method");
		System.out.println("Hello Static");
		
	}
}

public class StaticVariable {

	public static void main(String[] args) {
		Student s1=new Student(1,"Vaishali");
		Student s2=new Student(2,"Keshav");
		s1.display();
		Student.change();   //as it is static method, can be called without reference
		s2.display();
		Student.college="XYZ";
		//s1.change();
		s2.display();
	}

}





