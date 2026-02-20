package Recursion;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {
    public static void reverse(int[] arr, int l, int r){
        //Base Condition
        if(l >= r) return;

        //Swap
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        //Recursive Call
        reverse(arr, l+1, r-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, 0, arr.length-1);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
