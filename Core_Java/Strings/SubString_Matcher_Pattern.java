import java.util.regex.*;

public class SubString_Matcher_Pattern {
    public static void main(String[] args) {
        String str = "Vishal Waje";
        String subString = "Waje";

        // Pattern represents the complied regex.
        // Matcher checks the pattern.
        // Pattern is class.
        // complie is static method of pattern, take input as String which we need to
        // find in main String.
        Pattern pattern = Pattern.compile(subString);

        // Pattern class contains matcher method which takes main string as input.
        Matcher matcher = pattern.matcher(str);

        // Here, mathchers find method check the presence of substring in main String.
        boolean contains = matcher.find();
        System.out.println(contains);
    }
}
