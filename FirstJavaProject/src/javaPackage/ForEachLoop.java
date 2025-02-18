package javaPackage;

public class ForEachLoop {

	public static void main(String[] args) {
		int arr[] = {1,2,3,3,5};   //Defining array

		//int arr[] = new int[6];

		//print an array value using for each loop
		for(int i : arr) {
			System.out.println(i);
		}
		//		for(int i=0;i<arr.length;i++) {
		//			System.out.println(arr[i]);
		//		}
	}
}

/*1. If user tries to fetch the index more than the defined then "out of bounds" exception thrown.
 * eg: System.out.println(arr[7]);
If array size is defined but no element is mentioned and user tries to access that element 
then value displayed as "0" 
eg: int arr[]=new int[3];
arr[0]=1;
arr[1]=2;
System.out.println(arr[2]); */

