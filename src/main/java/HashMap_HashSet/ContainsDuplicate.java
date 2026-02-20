package HashMap_HashSet;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean duplicate(int[] arr){
        Set<Integer> set = new HashSet<>();

        for(int i : arr){
            if(set.contains(i)) return true;
            set.add(i);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};
        System.out.println(duplicate(arr));
    }
}
