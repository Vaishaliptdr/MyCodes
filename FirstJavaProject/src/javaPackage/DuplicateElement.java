/*Create a program to identify duplicate elements in an array*/

package javaPackage;

public class DuplicateElement {
    public static void main(String[] args) {
        // Example array
        int[] array = {4, 5, 6, 7, 4, 9, 8, 9, 7};

        System.out.println("Duplicate elements in the array:");
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        boolean hasDuplicates = false;

        // Compare each element with every other element
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    hasDuplicates = true;
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }
}

