import java.util.*;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int count = 0;

        if (number > 1) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count < 1) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + "is a prime number");
            }

        } else {
            System.out.println(number + "is not a prime number");
        }

    }
}