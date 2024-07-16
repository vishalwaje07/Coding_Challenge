import java.util.*;

public class Advanced_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("Number before swapping is : " + number1 + "&" + number2);

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("Numbers after swapping is : " + number1 + "&" + number2);
    }
}