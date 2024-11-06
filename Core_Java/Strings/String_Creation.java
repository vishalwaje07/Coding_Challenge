public class String_Creation {
    public static void main(String[] args) {
        // String Creation using string literals.
        // In this jvm checks the string pool for existing string with same value.
        // If matching data found then it will give the refrence only.
        // If no matching data found then it will add to the string pool.
        /*
         * String s1 = "Vishal";
         * String s2 = "Vishal";
         * System.out.println(s1 == s2);
         * // In this example it will give true
         * // Matching data found.
         */

        String s1 = "Vishal";
        String s2 = new String("Vishal");
        System.out.println(s1 == s2);

        // It will give false because it is not pointing to the same string
    }

}
