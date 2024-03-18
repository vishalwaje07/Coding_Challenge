import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int sum = 0;
        int backup = number;

        while (number > 0) {
            sum = sum + (number % 10) * (number % 10) * (number % 10);
            number = number / 10;

        }

        if (sum == backup) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
}
