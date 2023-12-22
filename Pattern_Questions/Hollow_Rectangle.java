import java.util.*;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and column");
        int rows = sc.nextInt();
        int column = sc.nextInt();

        // Outer Loop
        for (int i = 1; i <= rows; i++) {
            // Inner Loop
            for (int j = 1; j <= column; j++) {
                if (i == 1 || j == 1 || i == rows || j == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}