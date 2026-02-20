package HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashing {

    public static void main(String[] args) {

//        Set<String> set = new HashSet<>();
//
//        set.add("Apple");
//        set.add("Lemon");
//        System.out.println(set.contains("Apple"));
//        System.out.println(set.size());
//        set.remove("Apple");
//        System.out.println(set.contains("Apple"));
//        System.out.println(set.size());


        Map<String, Integer> map = new HashMap<>();

        map.put("Aryan", 10);
        map.put("Shivanshi", 22);
        System.out.println(map.get("Aryan"));
        System.out.println(map.get("S"));
        System.out.println(map.containsKey("Aryan"));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.size());
        System.out.println(map.entrySet());

        System.out.println(map.getOrDefault("Aryan_Tyagi", 0));

        //Printing hashMap
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " +
                               entry.getValue());
        }

    }
}
