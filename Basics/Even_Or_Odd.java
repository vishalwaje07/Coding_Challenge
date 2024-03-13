import java.util.*;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Given Number is even");
        } else {
            System.out.println("Given number is odd");
        }
    }
}