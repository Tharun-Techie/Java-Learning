package Basic_Concepts;

public class Testing_multi_array {
    // even u initialixe ie cloned a array in first step but still
    // java take is untill last so whatever the value the original array will
    // be haveing is the same thing thatcloneg array will be having

    public static void main(String[] args) {
        int[][] nums = new int[3][4];
        int[][] numsclone = nums.clone();
        int[][] result = new int[3][4];


        for (int[] row : numsclone) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = (int) (Math.random() * 100);
                System.out.print(nums[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
               // numsclone[row][col] = 100 - nums[row][col];
                System.out.print(numsclone[row][col] + " ");
            }
            System.out.println();
        }
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                result[row][col] = nums[row][col] + numsclone[row][col];
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }

    }
}