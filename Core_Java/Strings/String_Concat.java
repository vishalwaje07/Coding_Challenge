public class String_Concat {
    // Any String operation tries to modify then it will give us new String object.
    public static void main(String[] args) {
        String firstName = "Vishal";
        String lastName = "Waje";

        String str1 = "Hello";
        str1 = str1 + " " + "World";

        System.out.println(str1);

        // System.out.println(firstName + " " + lastName);
        // System.out.println(firstName + lastName);
        // System.out.println(firstName.concat(lastName));
        // System.out.println(firstName.concat(" ").concat(lastName));
    }

}
