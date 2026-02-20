package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right){

        //Base Case
        if(left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);

    }

    public static void merge(int[] arr, int left, int mid, int right) {

        //Create Temp Array
        List<Integer> temp = new ArrayList<>();

        int i = left;
        int j = mid+1;

        while (i <= mid && j <= right){
            if(arr[i] <= arr[j]) {
                temp.add(arr[i++]);
            } else {
                temp.add(arr[j++]);
            }
        }

        while (i<=mid){
            temp.add(arr[i++]);
        }

        while (j<=right){
            temp.add(arr[j++]);
        }


        //Copying temp to Original Array

        for(int num = left; num <= right; num++){
            arr[num] = temp.get(num - left);
        }
    }


    public static void main(String[] args) {
        int[] arr = {12, 10, 5, 2, 7, 1, 4, 8};
        mergeSort(arr, 0, arr.length-1);

        System.out.println("Sorted Array: ");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
