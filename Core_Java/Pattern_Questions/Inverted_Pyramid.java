import java.util.*;

public class Inverted_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = 1;

        // Outer Loop
        for (int i = number; i <= 4; i++) {
            // Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}