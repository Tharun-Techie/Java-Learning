package ShilpaMamQuestions;

// Rotate an array to the left by one position
public class Q4 {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array:");
        printArray(arr);

        // Call the rotation function
        rotateLeftByOne(arr);

        System.out.println("Array after left rotation by one position:");
        printArray(arr);
    }

    // Function to rotate the array to the left by one position
    public static void rotateLeftByOne(int[] arr) {
        // Your logic here

        int first = arr[0];

        for(int i=0; i< arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;

    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
