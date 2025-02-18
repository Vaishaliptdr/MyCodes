/*Sort array bubble sort*/

package javaPackage;

public class SortArray {
    public static void main(String[] args) {
        // Example array
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Original array:");
        printArray(array);

        // Sort the array
        bubbleSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    // Bubble sort implementation
    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

