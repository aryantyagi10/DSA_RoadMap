package Array;

public class MaximumValue {

    public static int maxValue(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }

    public static int minVale(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int j : arr){
            if(j < min){
                min = j;
            }
        }

        return min;
    }


    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2};
        System.out.println(maxValue(arr));
        System.out.println(minVale(arr));
    }
}
