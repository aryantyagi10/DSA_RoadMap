package Recursion;

public class ReverseStringUsingRecursion {

    public static String reverse(String s){
        if(s.isEmpty()) return "";

        return reverse(s.substring(1)) + s.charAt(0);

    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverse(s));
    }
}
