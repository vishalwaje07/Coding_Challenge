import java.util.*;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter second number");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " : is largest");
        } else if (number2 > number1) {
            System.out.println(number2 + " : is largest");
        } else {
            System.out.println("Numbers are equal");
        }
    }
}