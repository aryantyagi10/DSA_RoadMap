package TwoPointer_SlidingWindow;

public class minSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;


        for(int right = 0; right < nums.length; right++){
            currentSum = currentSum + nums[right];

            while(currentSum >= target){
                minLength = Math.min(minLength, right-left+1);

                currentSum = currentSum - nums[left];
                left++;
            }
        }


        if(minLength == Integer.MAX_VALUE) return 0;
        return minLength;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
}
