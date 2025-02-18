package javaPackage;

public class Java_Operators1 {

	public static void main(String[] args) {

		/*Java Assignment Operator Example*/
		int a=10;  
		int b=20;  
		a+=4;//a=a+4 (a=10+4)  
		b-=4;//b=b-4 (b=20-4)  
		System.out.println(a);  
		System.out.println(b);

		int c=10;  
		c+=3;//10+3  
		System.out.println(c);  
		c-=4;//13-4  
		System.out.println(c);  
		c*=2;//9*2  
		System.out.println(c);  
		c/=2;//18/2  
		System.out.println(c);  


		/*Java Assignment Operator Example: Adding short*/
		short d=10;  
		short e=10;  
		//d+=e;//d=d+e internally so fine  
		d=(short)(d+e);        //If we do not type cast then Compile time error because 10+10=20 now int  
		System.out.println(d);  
	}

}
