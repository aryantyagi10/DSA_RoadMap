package Sorting;


//Same as MergeSort//


import java.util.Arrays;

public class sortArray {

    public static int[] sortArray(int[] arr){

        mergeSort(arr, 0, arr.length-1);
        return arr;
    }


    public static void mergeSort(int[] arr, int left, int right){

        if(left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }


    public static void merge(int[] arr, int left, int mid, int right){

        //copyOfRange end index is EXCLUSIVE.
        //We need 'mid + 1' to include 'mid', and 'right + 1' to include 'right'
        int[] leftArr = Arrays.copyOfRange(arr, left, mid+1);
        int[] rightArr = Arrays.copyOfRange(arr, mid+1, right+1);

        int i = 0, j = 0, k = left;

        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < leftArr.length){
            arr[k++] = leftArr[i++];
        }

        while (j < rightArr.length){
            arr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 10, 5, 2, 7, 1, 4, 8};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
}
