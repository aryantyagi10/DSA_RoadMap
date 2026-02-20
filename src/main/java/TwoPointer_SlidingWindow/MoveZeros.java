package TwoPointer_SlidingWindow;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeros(int[] nums){
        int slow = 0;
        int fast = 0;

//        Strategy: slow: Tracks the position where the next non-zero should go.
//                  fast: Scans for non-zeros.

//         Crucial Logic: When fast finds a non-zero:
//                       1. Swap nums[slow] and nums[fast].
//                       2. Increment slow

        while(fast < nums.length){
            if (nums[fast] != 0) {

                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
            fast++;
        }


        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 0, 89};
        moveZeros(nums);
    }
}
