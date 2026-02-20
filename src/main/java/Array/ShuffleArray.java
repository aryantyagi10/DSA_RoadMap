package Array;

import java.util.Arrays;

public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];
        int left = 0;
        int right = n;

        for(int i=0; i<ans.length; i++){
            if(i%2 == 0){
                ans[i] = nums[left];
                left++;
            }else{
                ans[i] = nums[right];
                right++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
//        [2,3,5,4,1,7]
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}
