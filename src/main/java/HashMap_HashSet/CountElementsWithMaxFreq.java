package HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaxFreq {

    public static int maxFreqElement(int[] nums){

        Map<Integer, Integer> map = new HashMap<>();

        //Find Freq Map
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        //We got a map like - {[1, 2], [2, 2], [3, 1], [4, 1]}

        //Find Max Freq
        int maxFreq = 0;
        for(int count : map.values()){ //This loop is iterating in a value of a map only - [2, 2 ,1, 1]
            if(count > maxFreq){
                maxFreq = count;
            }
        }

        //Find Total Occurrence
        int total = 0;
        for(int count : map.values()){
            if(count == maxFreq){
                total += count;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        System.out.println(maxFreqElement(nums));
    }
}
