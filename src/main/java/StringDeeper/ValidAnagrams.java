package StringDeeper;

public class ValidAnagrams {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        int[] buckets = new int[26];

        for(int i=0; i < s.length(); i++){

            //Increment the count for each character.
            char charS = s.charAt(i);
            int indexS = charS - 'a';
            buckets[indexS]++;

            //Decrement the count for each character.
            char charT = t.charAt(i);
            int indexT = charT - 'a';
            buckets[indexT]--;
        }

        //If they are anagrams, the balance for every character should be exactly 0
        for(int count : buckets){
            if(count != 0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
