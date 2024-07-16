import java.util.*;

public class Sum_Of_Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("Your sum of first natural number is :" + sum);
    }
}
