package Sorting;

import java.util.Arrays;

public class FindMedian {
    public static double median(int[] arr){

        int n = arr.length;

        Arrays.sort(arr);

        if(arr.length % 2 != 0) {
             return arr[n/2];
        } else {
            return (arr[n/2] + arr[(n/2) - 1]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 8, 4};
        System.out.println(median(arr));
    }
}
