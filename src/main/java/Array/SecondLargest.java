package Array;

public class SecondLargest {

    public static int findSecondLargest(int[] arr){

        if(arr.length < 2) return -1;


        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE) return -1;

        return secondLargest;
    }


    public static void main(String[] args) {
        int[] arr = {1, 22, 43, 43, 65, 65, 5, 7, 2, 9, 9, 2 ,3};
//        int[] arr = {10, 10, 10};
        System.out.println(findSecondLargest(arr));
    }
}
