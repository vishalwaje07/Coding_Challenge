public class SubString_Contains {
    public static void main(String[] args) {
        String str = "Vishal, Waje";
        String subString = "Waje";

        // To check, if there is substring is or not.
        // Contains() checks the substring is present or not.
        // It is easiest and direct way to find the substring.
        boolean contains = str.contains(subString);
        System.out.println(contains);
    }
}