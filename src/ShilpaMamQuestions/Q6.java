package ShilpaMamQuestions;
// Find the second largest element in an array

public class Q6 {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {10, 20, 5, 3, 100,100,20};
        System.out.println("Original Array:");
        printArray(arr);

        // Call the function to find the second largest element
        int secondLargest = findSecondLargest(arr);

        System.out.println("The second largest element in the array is: " + secondLargest);
    }

    // Function to find the second largest element in an array
    public static int findSecondLargest(int[] arr) {
        // logic

        int lar = 0;
        int sec = 0;

        for(int num:arr){
            if (num>lar){
                sec = lar;
                lar = num;
            }
        }




        return sec; // Placeholder return value
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
