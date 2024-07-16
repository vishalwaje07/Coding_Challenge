import java.util.Scanner;

public class Diamond_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();

        for (int i = 1; i <= number - 1; i++) {
            for (int s = 1; s <= number - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int i = number; i >= 1; i--) {
            for (int s = 1; s <= number - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
