import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("Enter Operation ");
        String operation = sc.next();

        switch (operation) {
            case "Add":
                System.out.println(number1 + number2);
                break;
            case "Sub":
                System.out.println(number1 - number2);
                break;
            case "Multi":
                System.out.println(number1 * number2);
                break;
            case "Div":
                System.out.println(number1 / number2);
                break;
        }
    }
}