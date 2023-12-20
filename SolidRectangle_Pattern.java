import java.util.*;

public class SolidRectangle_Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and column");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        // Outer Lopp
        for (int i = 0; i <= rows; i++) {
            // Inner Loop
            for (int j = 0; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}