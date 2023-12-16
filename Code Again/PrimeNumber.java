import java.util.*;

public class PrimeNumber {
    public static void main(String args[]) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        if (number >= 1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(number + "Is not a prime Number");
            } 
            else {
                System.out.println(number + "Is  a prime number");
            }

        } else {
            System.out.println(number + "Is Not a prime number");
        }
    }
}