public class Reversed_String_StringBuilder {
    public static void main(String[] args) {
        // String is immutable is nature.
        // It means we cannot modifies it.
        String original = "Vishal Waje";

        // By using StringBuilder is mutable, we can modifies the string.
        // It is thread unsafe.
        // It is non syncnorized.
        StringBuilder sb = new StringBuilder(original);

        // reverse() to reverse the string.
        // toString() to represent the object as string.
        String reversed = sb.reverse().toString();

        // Printing the reversed string.
        System.out.println(reversed);
    }
}
