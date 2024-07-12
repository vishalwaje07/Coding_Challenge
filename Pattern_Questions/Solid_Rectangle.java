import java.util.*;

public class Solid_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and column");
        int rows = sc.nextInt();
        int column = sc.nextInt();

        // Outer Loop
        for (int i = 1; i <= rows; i++) {
            // Inner Loop
            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}