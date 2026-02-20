package String;

import java.util.Arrays;

public class ReverseWordInStringIII {

    public static String reverseWords(String s){
        String[] st = s.split(" ");

        System.out.println(Arrays.toString(st));

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<st.length; i++){
           StringBuilder tempSb = new StringBuilder();

           tempSb.append(st[i]).reverse();
           sb.append(tempSb);
           sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
