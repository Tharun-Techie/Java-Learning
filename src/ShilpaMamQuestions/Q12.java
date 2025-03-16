package ShilpaMamQuestions;

// question: Move all zeros to the end of the array.
class Q12 {
    public static void main(String[] args) {
        // Example input
        int[] arr = { 1, 3,0, 12,3,5,0,2,56,0,9,0,0,0,4,3,4,5,6};

        // Call the function
        int[] result = moveZerosToEnd(arr);

        // Print the result
        System.out.println("Array after moving zeros to the end:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static void leftMove(int[] arr, int pos) {
        int temp = arr[pos];
        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    // Function to solve the problem
    public static int[] moveZerosToEnd(int[] arr) {
         int[] myArr = new int[arr.length];
        int ind=0;
        for(int i=0; i<arr.length;i++ ){
            if (arr[i]!=0){
                myArr[ind]=arr[i];
                ind++;
            }

        }
        return myArr;
    }
}
