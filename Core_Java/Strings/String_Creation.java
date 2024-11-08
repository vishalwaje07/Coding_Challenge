
public class String_Creation {
    public static void main(String[] args) {
        // String Creation using string literals.
        // In this jvm checks the string pool for existing string with same value.
        // If matching data found then it will give the refrence only.
        // If no matching data found then it will add to the string pool.

        String s1 = "Vishal";
        String s2 = "Vishal";
        System.out.println(s1 == s2);
        // In this example it will give true
        // Matching data found.

        String s3 = "Vishal";
        String s4 = new String("Vishal");
        System.out.println(s3 == s4);

        // It will give false because it is not pointing to the same string

        // Using the intern() method
        // The intern() method is used to manually add string to the string pool.
        // If already present then it will give refence.
        // If not then it will add and give us the refrence.

        String s5 = new String("Vishal");
        String s6 = s5.intern();
        System.out.println(s6 == "Vishal");
    }

}
