package Basic_Concepts;

import java.util.Arrays;


public class Sorting_bruteforce {

    public void sortColors(int[] nums){
        System.out.println("Length of arr: "+nums.length);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <=i; j++) {
               if(nums[j]>nums[i]){
                   int temp = nums[i];
                   nums[i]=nums[j];
                   nums[j]=temp;
               }
            }
        }
        System.out.println(Arrays.toString(nums));

    }


    public static void main(String[] args) {
        int arr[] = {1,5,6,4,8,3,1,2,0};
        Sorting_bruteforce s = new Sorting_bruteforce();
        s.sortColors(arr);
    }

}
