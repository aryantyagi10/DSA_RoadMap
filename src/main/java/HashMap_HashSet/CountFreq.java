package HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class CountFreq {

    public static void countFrequencies(String st){

        HashMap<Character, Integer> freq = new HashMap<>();

        for(char ch : st.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void main(String[] args) {

        String st = "Tree";
        countFrequencies(st);
    }
}
