/*Find the second largest in an ARRAY*/

package javaPackage;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the size of the array
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Check if the array size is valid
		if (size < 2) {
			System.out.println("Array must have at least two elements.");
		}

		// Input the elements of the array
		int[] array = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		// Find the second largest element
		int secondLargest = findSecondLargest(array);

		// Display the result
		System.out.println("The second largest element in the array is: " + secondLargest);
		scanner.close();
	}


	public static int findSecondLargest(int[] array) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : array) {
			if (num > largest) {
				// Update second largest before changing largest
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				// Update second largest if num is smaller than largest but larger than secondLargest
				secondLargest = num;
			}
		}

		// Check if a valid second largest exists
		if (secondLargest == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("No second largest element exists (array may have duplicate elements).");
		}

		return secondLargest;
	}
}
