package Searching;

import java.util.Arrays;

public class FindFirstAndLast {

    public static int[] searchRange(int[] nums, int target){
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    public static int findFirst(int[] nums, int target){
        int index = -1;

        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if(target == nums[mid]){
                index = mid;
                right = mid - 1;
            } else if(target > nums[mid]){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        return index;
    }

    public static int findLast(int[] nums, int target){
        int index = -1;

        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if(target == nums[mid]){
                index = mid;
                left = mid + 1;
            } else if(target > nums[mid]){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
