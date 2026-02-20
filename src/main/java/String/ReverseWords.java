package String;

public class ReverseWords {

    public static String reverseWord(String st){
        String[] s  = st.trim().split("\\s+");  // \\s+ splits on any amount of whitespaces
        StringBuilder sb = new StringBuilder();

        for(int i = s.length-1; i>=0; i--){
            sb.append(s[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String st = "The sky is blue ";
        System.out.println(reverseWord(st));
    }
}
