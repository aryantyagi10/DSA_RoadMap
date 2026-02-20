package HashMap_HashSet;

import java.util.HashSet;

public class FirstLetterToAppearTwice {

    public static char repeatedCharacter(String s){
        HashSet<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                return ch;
            }

            set.add(ch);
        }

        return ' ';
    }


    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
}
