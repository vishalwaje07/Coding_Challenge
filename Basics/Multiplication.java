
import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int result = number1 * number2;
        System.out.println("Your result is :" + result);
    }
}
