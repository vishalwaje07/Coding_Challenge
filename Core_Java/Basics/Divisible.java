import java.util.*;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();

        if (number % 5 == 0) {
            System.out.println("Number is divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");
        }
    }
}