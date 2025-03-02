package ShilpaMamQuestions;

// Reverse an array
public class Q5 {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 4, 5,7};
        System.out.println("Original Array:");
        printArray(arr);

        // Call the function to reverse the array
        reverseArray(arr);

        System.out.println("Array after reversal:");
        printArray(arr);
    }

    // Function to reverse the array
    public static void reverseArray(int[] arr) {
        int n = arr.length / 2;


    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
