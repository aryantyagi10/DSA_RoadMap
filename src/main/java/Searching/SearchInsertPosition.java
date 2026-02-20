package Searching;

public class SearchInsertPosition {

    /* If the number isn't found, left will always end up at the first number that is greater than the target.
    If the target is bigger than everything, left will end up equal to array.length (at the very end). */


    public static int searchInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;

        System.out.println(searchInsert(nums, target));
    }
}
