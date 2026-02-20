package Sorting;

import java.util.*;

public class SortCharByFreq {

    public static String freqSort(String s){
        Map<Character, Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()){
            freq.put(ch, (freq.getOrDefault(ch, 0) + 1));
        }

        // Create a list of the KEYS (Characters)
        List<Character> chars = new ArrayList<>(freq.keySet());


        //Sort the list using the Comparator logic
        Collections.sort(chars,(a,b) -> freq.get(b) - freq.get(a));

        StringBuilder builder = new StringBuilder();
        for(char c : chars){
            int count = freq.get(c);
            for (int i=0; i<count; i++){
                builder.append(c);
            }
        }
        return builder.toString();

    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(freqSort(s));
    }
}
