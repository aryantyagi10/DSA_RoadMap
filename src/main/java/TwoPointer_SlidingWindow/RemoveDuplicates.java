package TwoPointer_SlidingWindow;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums){
        int slow = 0;
        int fast = 1;

        while (fast < nums.length){
            if(nums[slow] == nums[fast]){
                fast++;
            }else{
                nums[++slow] = nums[fast];
                fast++;
            }
        }

        return slow+1;
    }

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}
