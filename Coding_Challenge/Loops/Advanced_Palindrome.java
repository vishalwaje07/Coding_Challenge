import java.util.Scanner;

public class Advanced_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();

        // Effective Answer by using String Builder
        StringBuilder reveresedStr = new StringBuilder(str).reverse();
        boolean isPalindrome = str.equalsIgnoreCase(reveresedStr.toString());
        System.out.println(isPalindrome ? "The string is palindrome" : "The string is not palindrome");

    }
}