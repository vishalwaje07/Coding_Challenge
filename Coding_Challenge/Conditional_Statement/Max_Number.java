import java.util.*;

public class Max_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Number : " + number1 + " is Greater");
        } else if (number2 > number3) {
            System.out.println("Number : " + number2 + " is Greater");

        } else {
            System.out.println("Number : " + number3 + " is Greater");
        }
    }
}