import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }
    }
}

