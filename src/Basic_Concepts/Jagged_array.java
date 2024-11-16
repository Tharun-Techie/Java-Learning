package Basic_Concepts;

public class Jagged_array {
    public static void main(String[] args) {
        // Jahagged Array ,a 2d array with multiple colums with different sizes,, for eack rows

        int[][] arr = new int[3][];

        arr[0] = new int[(int) (Math.random()*10)];
        arr[1] = new int[(int) (Math.random()*10)];
        arr[2] = new int[(int) (Math.random()*10)];

        for(int row[]: arr){
            for(int col:row){
                col = (int) (Math.random()*10);
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}
