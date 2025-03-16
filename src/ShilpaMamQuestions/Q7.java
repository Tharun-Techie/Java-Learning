package ShilpaMamQuestions;

// Check if an array is sorted in ascending or descending order
public class Q7 {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 3, 3, 4, 5};
        System.out.println("Is the array sorted in ascending order? " + isSortedAscending(arr));
        System.out.println("Is the array sorted in descending order? " + isSortedDescending(arr));
    }

    // Function to check if the array is sorted in ascending order
    public static boolean isSortedAscending(int[] arr) {

        for(int i=0; i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) return false;
        }

        return true; // Placeholder return value
    }

    // Function to check if the array is sorted in descending order
    public static boolean isSortedDescending(int[] arr) {
        // Your logic here

        for(int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) return false;
        }

        return true; // Placeholder return value
    }
}
