package Array;

public class RangeSumQuery {

    public static int rangeSum(int[] prefix, int l, int r){
        int rangeSum;
        if(l == 0){
            rangeSum = prefix[r];
        } else {
            rangeSum = prefix[r] - prefix[l-1];
        }

        return rangeSum;
    }


    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 8, 6, 1, 4, 7, 9, 10};

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for(int i=1; i< arr.length; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }

        System.out.println(rangeSum(prefix, 4, 7));
        System.out.println(rangeSum(prefix, 2, 5));
    }
}
