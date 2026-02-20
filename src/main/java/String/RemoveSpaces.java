package String;

public class RemoveSpaces {

    public static void removeSpaces(String st){

        st = st.replaceAll(" ", "");
        System.out.println(st);
    }

    public static void main(String[] args) {
        String st  = "H E L L O";
        removeSpaces(st);
    }
}
