package ShilpaMamQuestions;

public class Q11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 3, 9, 0, 5, 4, 2, 3};

        int[] freq = countArr(arr);
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] != -1) {
                System.out.println(arr[i] + "|" + freq[i]);
            }
        }
    }


    static int[] countArr(int[] arr) {
        int[] freq = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = -1;
                }
            }
            if (freq[i] != -1) freq[i] = count;
        }
        return freq;
    }
}
