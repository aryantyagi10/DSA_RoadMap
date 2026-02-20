package StringDeeper;

import java.util.Arrays;

public class FreqArray {

    public static int[] freqArray(String s){
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        return freq;
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(Arrays.toString(freqArray(s)));
    }
}
