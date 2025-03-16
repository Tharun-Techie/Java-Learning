package ShilpaMamQuestions;

// Question: Find the missing number in an array of size n-1 containing numbers from 1 to n.
class Q10 {
    public static void main(String[] args) {
        // Example input, all test cases have to be included
        int[] arr = {4, 5, 2, 1}; // Missing number is 3
        int n = 5; // Total range is from 1 to 5

        // Call the function
        int missingNumber = findMissingNumber(arr);

        // Print the result
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        // Enter your logic here

        int n = arr.length + 1;
        int sum =0;
        for( int a: arr) sum+=a;
        int totalSum = n * (n+1) / 2;
        return totalSum-sum;
    }
}
