public class SubString_IndexOf {
    public static void main(String[] args) {
        String str = "Vishal, Waje";
        String subString = "Waje";

        // To check the substring is present or not.
        // It Checks the index of first occurance of the substring.
        boolean contains = str.indexOf(subString) != -1;
        System.out.println(contains);
    }
}