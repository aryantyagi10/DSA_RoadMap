package Array;

import java.util.Arrays;

public class RotateArray {

    public static void rotateWithExtraArray(int[] arr, int k){
        int[] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            ans[(i+k) % ans.length] = arr[i];  //The modulo is the standard tool for "wrapping around" limits
        }

        System.out.println(Arrays.toString(ans));
    }

    public static void reverse(int[] arr, int start, int end){

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }


    //If we want to do In-place rotation we need to use Reverse Algorithm.
    //i.e. 1- Reverse the WHOLE array. 2- Reverse the FIRST k elements. 3- Reverse the REST of the elements.

    public static void rotateInPlace(int[] arr, int k){
        // Safety: Handle cases where k is larger than the array size
        k = k % arr.length;


        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateWithExtraArray(arr, k);
        rotateInPlace(arr, k);
    }
}


