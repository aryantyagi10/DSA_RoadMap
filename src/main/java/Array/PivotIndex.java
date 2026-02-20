package Array;

public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        int sumArray = 0;

        for (int num : nums) {
            sumArray = sumArray + num;
        }


        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i] = nums[i] + prefix[i-1];
        }

        int sumLeft;
        int sumRight;

        for(int i=0; i<nums.length; i++){
            sumLeft = prefix[i] - nums[i];
            sumRight = sumArray - sumLeft - nums[i];

            if(sumLeft == sumRight){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};

        System.out.println(pivotIndex(nums));
    }
}
