import java.util.Scanner;

public class Reverse_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int rev = 0;

        while (number > 0) {
            rev = rev * 10 + number % 10;
            number = number / 10;

        }
        System.out.println(rev);
    }
}
