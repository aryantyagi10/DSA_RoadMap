package TwoPointer_SlidingWindow;

public class MaxConsecutiveOnesIII {
    
    public static int longestOnes(int[] nums, int k){
        int left = 0;
        int zeros = 0;
        int maxLength = 0;

        for(int right = 0; right<nums.length; right++){
            // 1. If we see a zero, add it to our count
            if(nums[right] == 0){
                zeros++;
            }
            // 2. If we have TOO MANY zeros (> K), shrink the window
            while(zeros > k){
                // Check the number leaving on the left
                if(nums[left] == 0){
                    zeros--; // We removed a zero, so count goes down
                }
                left++; // Move left border forward
            }

            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
