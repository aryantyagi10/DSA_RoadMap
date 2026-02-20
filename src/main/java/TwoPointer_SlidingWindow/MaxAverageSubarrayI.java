package TwoPointer_SlidingWindow;

public class MaxAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k){
        int left = 0;

        //Calculate Sum of First K elements
        double currentSum = 0;
        for(int i=0; i<k; i++){
            currentSum = currentSum + nums[i];
        }

        double maxSum = currentSum;

        //Now time to slide the window
        for(int right=k; right<nums.length; right++){
            currentSum = currentSum + nums[right] - nums[left];
            left++;

            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum/k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println(findMaxAverage(nums, k));
    }
}
