import java.util.*;

public class Greater_Or_Not {
    public static void main(String[] args) {
        System.out.println("Enter two  numbers");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number1 == number2) {
            System.out.println(number1 + "and" + number2 + " are equal");
        } else {
            if (number1 > number2) {
                System.out.println(number1 + "Number1 is Greater");
            } else {
                System.out.println(number2 + "Number2 is Greater");
            }
        }
    }
}
