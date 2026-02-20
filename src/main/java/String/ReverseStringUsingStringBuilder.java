package String;

public class ReverseStringUsingStringBuilder {

    public static String reverse(String st){
        StringBuilder sb = new StringBuilder(st);

        st = sb.reverse().toString();
        return st;
    }

    public static void main(String[] args) {
        String st = "Hello, World";
        System.out.println(reverse(st));
    }
}
