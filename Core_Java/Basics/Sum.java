
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int sum = number1 + number2;
        System.out.println(sum);
    }

}
