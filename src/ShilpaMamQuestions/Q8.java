package ShilpaMamQuestions;

// Question: Remove duplicates from a sorted array.
class Q8 {
    public static void main(String[] args) {
        // Example input, all test cases have to be included
        int[] arr = {1, 1, 2, 2, 3, 3, 4}; // Sorted array with duplicates

        // Call the function
        int newLength = removeDuplicates(arr);

        // Print the result
        System.out.println("The new length of the array is: " + newLength);
        System.out.print("The array after removing duplicates is: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        // Enter your logic here
        return -1; // Placeholder return statement
    }
}
