package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetAfterSorting {

    public static List<Integer> targetIndices(int[] arr, int target){
        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};
        int target = 2;

        System.out.println(targetIndices(arr, target));
    }
}
