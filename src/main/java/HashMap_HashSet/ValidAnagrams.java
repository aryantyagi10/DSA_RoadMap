package HashMap_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidAnagrams {

    public static boolean isAnagram(String s, String t){

        Set<String> set = new HashSet<>();

        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);
        String key1 = new String(arr1);
        set.add(key1);


        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);
        String key2 = new String(arr2);

        return set.contains(key2);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
