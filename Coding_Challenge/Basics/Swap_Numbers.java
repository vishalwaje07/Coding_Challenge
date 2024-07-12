import java.util.Scanner;

public class Swap_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int temp = 0;
        System.out.println("Numbers before Swapping : " + number1 + " " + number2);

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Numbers after swapping : " + number1 + " " + number2);

    }
}