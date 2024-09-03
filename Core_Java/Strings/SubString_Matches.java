public class SubString_Matches {
    public static void main(String[] args) {
        String str = "Vishal Waje";
        String subString = "waje";

        // To check the substring is present or not.
        // The matches methods uses ".*" as a wild card to match any charatcers
        // before and after the substring.
        // If the substring is present anywhere within the substring.
        // toLowerCase() it will convert to the lower case.
        boolean contains = str.toLowerCase().matches(".*" + subString + ".*");
        System.out.println(contains);
    }

}
