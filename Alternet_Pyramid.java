import java.util.*;

public class Alternet_Pyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");

        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("@");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}