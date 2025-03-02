package ShilpaMamQuestions;

// Find the sum of all elements in an array
public class Q2 {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        printArray(arr);

        // Call the function to find the sum
        int sum = findSum(arr);

        System.out.println("Sum of all elements in the array: " + sum);
    }

    // Function to find the sum of all elements in an array
    public static int findSum(int[] arr) {
        // Your logic here
        int sum =0;
        for(int a:arr){
            sum = sum + a;
        }
        return sum;
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
