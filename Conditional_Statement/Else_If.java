import java.util.*;

public abstract class Else_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers are equal");
        } else if (number1 > number2) {
            System.out.println("Number1 is greater");
        } else {
            System.out.println("number2 is greater");
        }
    }

}
