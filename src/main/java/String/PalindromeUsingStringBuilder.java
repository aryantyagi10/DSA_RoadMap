package String;

public class PalindromeUsingStringBuilder {

    public static boolean palindrome(String st){
        StringBuilder sb = new StringBuilder(st);

        String newSt = sb.reverse().toString();



        return st.equals(newSt);
    }

    public static void main(String[] args) {
        String st = "madam";
        System.out.println(palindrome(st));
    }
}
