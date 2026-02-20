package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr){

        int n = arr.length;

        for(int i=0; i<n-1; i++){  //Outer loop to repeat the process
            for(int j=0; j < n-1-i; j++){  // Inner loop does comparison
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
