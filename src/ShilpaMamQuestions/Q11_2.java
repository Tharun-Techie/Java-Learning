package ShilpaMamQuestions;

// Question: Find the frequency of each element in an array.
class Q11_2 {
    public static void main(String[] args) {
        // Example input, all test cases have to be included
        int[] arr = {2, 2, 3, 4, 3, 4, 2};
        int[] countArray = find(arr);


        for(int a: arr) System.out.print(a+"\t");
        System.out.println();
        for(int a:countArray) System.out.print(a+"\t");
    }


    public static int[] find(int[] arr){
        int[] countNum = new int[arr.length];

        for(int i=0; i < arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if (countNum[i]==0){
                    if(arr[i]==arr[j]) count++;
                }
            }
            countNum[i] = count;
        }


        return countNum;
    }


}
