package Basic_Concepts;

public class Multi_array {


    public static void main(String[] args) {
        int[][] nums = new int[3][4];
        int[][] numsclone = new int[3][4];
        int[][] result = new int[3][4];


//        for(int[] num:nums){
//            for(int arr:num){
//                arr = (int) (Math.random()*10);
//                System.out.print(arr + " ");
//            }
//            System.out.println();
//        }


        for(int[] row:numsclone){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

        for(int row = 0; row< nums.length; row++){
            for(int col =0; col<nums[row].length;col++){
                nums[row][col] = (int) (Math.random()*100);
                System.out.print(nums[row][col]+" ");
            }
            System.out.println();
        }

        for(int row = 0; row<nums.length;row++){
            for(int col = 0; col<nums[row].length;col++){
                numsclone[row][col] = 100 - nums[row][col];
                System.out.print(numsclone[row][col]+" ");
            }
            System.out.println();
        }
         for(int row = 0; row<nums.length;row++){
            for(int col = 0; col<nums[row].length;col++){
                result[row][col] =  nums[row][col] + numsclone[row][col];
                System.out.print(result[row][col]+" ");
            }
            System.out.println();
        }
    }
}
