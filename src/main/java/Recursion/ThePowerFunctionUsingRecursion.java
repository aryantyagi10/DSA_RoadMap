package Recursion;

public class ThePowerFunctionUsingRecursion {

    public static int power(int base, int n){
        if(n == 0) return 1;

        return base * power(base, n-1);

    }

    public static void main(String[] args) {
        int base = 2;
        int n = 3;

        System.out.println(power(base, n));
    }
}
