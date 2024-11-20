package advConcept;

import java.util.HashSet;
import java.util.Set;


public class hashset {

    static boolean solution(int[] nums, int k){
         Set<Integer> val = new HashSet<>();

        for(int arr: nums){
            if ( val.contains(arr)== false){
                val.add(arr);
            }
            else if (val.contains(arr) == true){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        int k = 3;
        System.out.println(solution(nums,k));
    }
}
