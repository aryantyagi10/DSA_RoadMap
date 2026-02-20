package String;

public class reverseString {

    public static void reverse(String st){
        char[] arr = st.toCharArray();

        int start = 0;
        int end = arr.length-1;
        while (start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        String newString = new String(arr);
        System.out.println(newString);
    }

    public static void main(String[] args) {
        String st = "Hello";
        reverse(st);
    }
}
