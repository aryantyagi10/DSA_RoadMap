package String;

public class CountVowels {

    public static void count(String st){

        int vowelsCount = 0;
        int consonantsCount = 0;

        for(int i=0; i<st.length(); i++){

            char originalCh = st.charAt(i);

            // Convert it to lowercase just for checking (Zero memory allocation)
            char ch = Character.toLowerCase(originalCh);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelsCount++;
            } else if(Character.isLetter(ch)){
                consonantsCount++;
            }
        }

        System.out.println("Vowels : " + vowelsCount);
        System.out.println("Consonants : " + consonantsCount);
    }

    public static void main(String[] args) {

        String st = "Hello, 123";
        count(st);
    }
}
