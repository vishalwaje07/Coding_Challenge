public class Reversed_String_Recursion {
    public static void main(String[] args) {
        String original = "Vishal Waje";
        String reversed = reverseString(original);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
