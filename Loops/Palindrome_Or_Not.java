import java.util.Scanner;

public class Palindrome_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        int backup = number;
        int rev = 0;

        while (number > 0) {
            rev = rev * 10 + number % 10;
            number = number / 10;
        }

        if (backup == rev) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }

}
