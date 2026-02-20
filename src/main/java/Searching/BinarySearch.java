package Searching;

public class BinarySearch {

    public static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(target == arr[mid]){
                return mid;
            } else if(target > arr[mid]){
                left = mid+1;
            } else
                right = mid-1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 5;

        System.out.println(search(arr, target));
    }
}
