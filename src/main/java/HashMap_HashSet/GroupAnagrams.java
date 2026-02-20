package HashMap_HashSet;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] st){

        Map<String, List<String>> map = new HashMap<>();

        //To Find Key by sorting
        for(String s : st){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>()); //If Key doesn't exist we are creating an empty List.
                //Ex- map = {"aet", []}.
            }

            map.get(key).add(s); //Adding that word to the list.
            // map.get(key) is giving the list (Empty or Non-Empty). And then we are adding the word to that list.

        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] st = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(st));
    }
}
