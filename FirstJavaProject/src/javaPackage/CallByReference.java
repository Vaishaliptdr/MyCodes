/*In case of call by value original value is not changed.
 * abc */
package javaPackage;

public class CallByReference {
	int data = 50;
	void change(int data){  
		data=data+100;//changes will be in the local variable only  
		System.out.println("Local changes to variable: "+data);
	}  

	public static void main(String args[]){  
		CallByReference op=new CallByReference();  

		System.out.println("before change "+op.data);  
		op.change(500);  
		System.out.println("after change "+op.data);  

	}  
}  