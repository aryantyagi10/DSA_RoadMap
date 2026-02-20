package Sorting;

import java.util.Arrays;

public class CheckPermutation {

    public static boolean checkPermutation(int[] a, int[] b){

        if(a.length != b.length) return false;

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 1, 2};

        System.out.println(checkPermutation(a, b));
    }
}
