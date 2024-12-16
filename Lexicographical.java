import java.util.Scanner;

public class LexicographicalOrderBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of strings
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline character

        // Input the strings
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            System.out.print("String " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }

        // Sort the strings using Bubble Sort
        bubbleSort(strings);

        // Output the sorted strings
        System.out.println("\nStrings sorted in lexicographical order:");
        for (String str : strings) {
            System.out.println(str);
        }

        sc.close();
    }

    // Bubble Sort implementation for sorting strings
    public static void bubbleSort(String[] array) {
        int n = array.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            System.out.println("\nPass " + (i + 1) + ":");
            boolean swapped = false;

            // Inner loop for comparing adjacent strings
            for (int j = 0; j < n - i - 1; j++) {
                System.out.println("Comparing \"" + array[j] + "\" with \"" + array[j + 1] + "\"");

                // Comparing two adjacent strings lexicographically
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap if they are in the wrong order
                    System.out.println("Swapping \"" + array[j] + "\" and \"" + array[j + 1] + "\"");
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Displaying the array after each pass
            System.out.print("Array after pass " + (i + 1) + ": ");
            for (String str : array) {
                System.out.print(str + " ");
            }
            System.out.println();

            // If no swaps, the array is already sorted
            if (!swapped) {
                System.out.println("No swaps occurred in this pass. Array is already sorted!");
                break;
            }
        }
    }
}
