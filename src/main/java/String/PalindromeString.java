package String;

public class PalindromeString {

    public static boolean palindrome(String st){

        int start = 0;
        int end = st.length() - 1;

        while (start < end){
            if(st.charAt(start) == st.charAt(end)) {
                start++;
                end--;
            } else return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String st = "madam";
        System.out.println(palindrome(st));
    }
}
