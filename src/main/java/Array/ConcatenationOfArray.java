package Array;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] arr){
        int n = arr.length;
        int[] ans = new int[2*n];

        for(int i=0; i<ans.length; i++){
            ans[i] = arr[i%n];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
}
