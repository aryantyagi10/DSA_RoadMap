package Searching;

public class Sqrt {

    public static int mySqrt(int x){

        if(x == 0) return 0;

        int left = 1;
        int right = x;
        int ans = 0;

        while(left <= right){
            int mid = left + (right - left) / 2;
            long val = (long)mid * mid;

            if(val == x){
                return mid;    // Found exact match
            } else if(val < x){
                ans = mid;     // mid is small enough, it might be the answer!
                left = mid+1;  // Let's try to find a bigger one
            } else {
                // val > x: mid is too big! It cannot be the answer.
                // Don't save it. Just look lower
                right = mid-1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
}
