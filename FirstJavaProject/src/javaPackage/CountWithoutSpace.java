/*This class is calculate the count of non-space characters in a string.*/

package javaPackage;

import java.util.Scanner;

public class CountWithoutSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt user for input
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();

		// Count non-space characters
		int count = 0;
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) != ' ') {
				count++;
			}
		}

		// Display the result
		System.out.println("Number of non-space characters: " + count);
		scanner.close();
	}

}
