import java.util.*;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(
                " Enter 1 for additon \n Enter 2 for substract\n Enter 3 for multiplication \n Enter 4 for Division \n Enter 5 Modulo \n");

        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("Addition of two numbers is :" + number1 + number2);
                break;
            case 2:
                System.out.println("Substraction of two numbers is :" + (number1 - number2));
                break;
            case 3:
                System.out.println("Multiplication of two numbers is :" + number1 * number2);
                break;
            case 4:
                System.out.println("Division of two numbers is :" + number1 / number2);
                break;
            case 5:
                System.out.println("Modulo of two numbers is :" + number1 % number2);
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

}
