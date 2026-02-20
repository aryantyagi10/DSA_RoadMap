package String;

public class ValidPalindrome {

    public static boolean isPalindrome(String st){
        st = st.toLowerCase().replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = st.length() - 1;

        while (start < end){
            if(st.charAt(start) == st.charAt(end)){
                start++;
                end--;
            } else return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String st = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(st));
    }

}
