package ShilpaMamQuestions;

//Find the maximum and minimum elements in an array.
class Q1 {
    public static void main(String[] args) {
        // Example input
        int[] arr = {5, 12, 9, 18, 3, 21};

        // Call the function
        int[] result = findMinMax(arr);

        // Print the result
        System.out.println("Maximum value: " + result[1]);
        System.out.println("Minimum value: " + result[0]);
    }
    public static int[] findMinMax(int[] arr) {
        // Initialize max and min with the first element of the array
        int max = arr[0];
        int min = arr[0];

        for(int a:arr){

            if (a>max){
                max = a;
            }
            if (a<min){
                min=a;
            }
        }



        return new int[] {min, max};
    }
}
