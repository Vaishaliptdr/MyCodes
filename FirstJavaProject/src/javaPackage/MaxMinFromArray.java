/*How to find maximum and minimum in an ARRAY?
 * 1. By sorting the array
 * 2. Without sorting array*/

package javaPackage;

//import java.util.Arrays;
import java.util.Scanner;

//public class MaxMinFromArray {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input the size of the array
//        System.out.println("Enter the size of the array: ");
//        int size = scanner.nextInt();
//
//        // Check if the array size is valid
//        if (size < 1) {
//            System.out.println("Array must have at least one element.");
//            return;
//        }
//
//        // Input the elements of the array
//        int[] array = new int[size];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        // Sort the array
//        Arrays.sort(array);
//
//        // Find the maximum and minimum elements
//        int max = array[size - 1]; // The last element is the maximum
//        int min = array[0];       // The first element is the minimum
//
//        // Display the results
//        System.out.println("Maximum element in the array: " + max);
//        System.out.println("Minimum element in the array: " + min);
//        scanner.close();
//    }
//    
//}


public class MaxMinFromArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the size of the array
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Check if the array size is valid
		if (size < 1) {
			System.out.println("Array must have at least one element.");
		}

		// Input the elements of the array
		int[] array = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		// Find the maximum and minimum elements
		int[] result = findMaxAndMin(array);

		// Display the results
		System.out.println("Maximum element in the array: " + result[0]);
		System.out.println("Minimum element in the array: " + result[1]);
		scanner.close();
	}

	public static int[] findMaxAndMin(int[] array) {
		int max = array[0];
		int min = array[0];

		for (int num : array) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}

		return new int[]{max, min};

	}
}

