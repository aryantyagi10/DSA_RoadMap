package Sorting;

import java.util.Arrays;

public class MergeSortedArrayInPlace {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;         //Last valid element in nums1
        int j = n-1;         //Last element in nums2
        int k = m + n - 1;   //Last index of nums1

        //We will merge from the end of the array

        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        //Only coping nums2 remaining element because If nums1 still has element left -> they're already in correct order
        while (j >= 0){
            nums1[k--] = nums2[j--];
        }

        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};

        int m = 3;  //number of valid elements in nums1
        int n = 3;  //number of elements in nums2

        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }
}
