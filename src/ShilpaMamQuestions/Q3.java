package ShilpaMamQuestions;
// Rotate an array to the right by one position
class Q3 {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array:");
        printArray(arr);

        // Call the rotation function
        rotateRightByOne(arr);

        System.out.println("Array after right rotation by one position:");
        printArray(arr);
    }

    // Function to rotate the array to the right by one position
    public static void rotateRightByOne(int[] arr) {
        int last = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }

        arr[0] = last;

    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
