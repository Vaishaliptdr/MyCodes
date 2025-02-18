package javaPackage;
class Animal{                     //Parent Class

	void eat()
	{System.out.println("eating...");
	}  
}  
class Dog extends Animal{         //Subclass
	void eat()                   //Overridden method
	{System.out.println("eating bread...");
	}  
}  
public class MethodOverriding {

	public static void main(String[] args) {
		Animal A = new Dog();        //Up casting
		A.eat();

	}

}
