package Basic_Concepts;

public class TwoD_Rando_size_Arrays {
    public static void main(String[] args) {
                int[][] arr = new int[(int) (Math.random() * 1000)][(int) (Math.random() * 1000)];
        for(int row=0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                arr[row][col] = (int)(Math.random()*100);
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
