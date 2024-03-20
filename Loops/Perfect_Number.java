import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }

        }
        if (sum == number) {
            System.out.println("Number is perfect");
        } else {
            System.out.println("Number is not perfect");
        }
    }

}
