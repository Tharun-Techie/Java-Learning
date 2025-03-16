package ShilpaMamQuestions;

// Question: Find the first repeating element in an array.
class Q9 {
    public static void main(String[] args) {
        // Example input, all test cases have to be included
        int[] arr = {10, 50,75, 50,55,25,35,5,5,5,535,9 , 4, 3, 5, 6}; // First repeating element is 3

        // Call the function
        int firstRepeating = findFirstRepeating(arr);

        // Print the result
        if (firstRepeating != -1) {
            System.out.println("The first repeating element is: " + firstRepeating);
        } else {
            System.out.println("No repeating elements found.");
        }

//        for(int a:arr) System.out.print(a+"\t");
    }

    public static int findFirstRepeating(int[] arr) {

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if( arr[j] < arr[i]){

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        int i=0;
        while (arr[i]!=arr[i+1]) i++;


        return arr[i]; // Placeholder return statement
    }
}
