package Basic_Concepts;

public class ThreeD_Array {
    public static void main(String[] args) {
        int size = 5;
        int[][][] arr = new int[size][size][size];
        int count = 0;
        // Initialize the array with some values
        for (int len = 0; len < arr.length; len++) {
            for (int high = 0; high < arr[len].length; high++) {
                for (int wid = 0; wid < arr[len][high].length; wid++) {
                    arr[len][high][wid] = count++; // Example initialization
                    System.out.print(arr[len][high][wid] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}