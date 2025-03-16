package ShilpaMamQuestions;

// question: Merge two sorted arrays into a single sorted array.
class Q13 {
    public static void main(String[] args) {
        // Example input
        int[] arr1 = {1, 3, 5, 7, 23, 45, 67, 89, 320};
        int[] arr2 = {2, 4, 6, 8, 34, 54, 68, 89};

        // Call the function
        int[] result = mergeSortedArrays(arr1, arr2);

        // Print the result
        System.out.println("Merged sorted array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    // Function to solve the problem
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while(j < arr2.length) {
            result[k++] = arr2[j++];
        }


        return result; // Default return value
    }
}
