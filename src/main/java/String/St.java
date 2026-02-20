package String;

import java.util.*;

public class St {
    public static void main(String[] args) {

//        String st = " Java code ";
//
//        //System.out.println(st.charAt(2));
//
//        String[] parts = st.trim().split(" ");
//        System.out.println(parts.length);
//
//        //["java", "code"];
//
//
//        //char[] arr = st.toCharArray();

//        StringBuilder sb = new StringBuilder("hello");
//        sb.append("World");
//
//        sb.insert(5, ", ");
////        sb.delete(0, 5);
//
//        sb.setCharAt(0, 'H');
//
//        sb.reverse();
//        String result = sb.toString();
//        System.out.println(result);
//        String st = "H e l l o , w o r l d";
//        String s = st.replaceAll(" ", "");
//
//        System.out.println(s);

//        StringBuilder sb = new StringBuilder(st);
//
//        sb.reverse();
//        System.out.println(sb);

        String st = "Hello World";


//        char[] ch = st.toCharArray();
//        System.out.println(Arrays.toString(ch));


        System.out.println(st.contains("H"));

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        System.out.println(set.size());
        set.clear();
        System.out.println(set.size());
    }
}
