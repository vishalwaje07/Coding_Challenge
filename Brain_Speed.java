
/* In ChefLand, human brain speed is measured in bits per second (bps). 
Chef has a threshold limit of 
X bits per second above which his calculations are prone to errors. 
If Chef is currently working at 
Y bits per second, is he prone to errors?

If Chef is prone to errors print YES, otherwise print NO. */
import java.util.*;

public class Brain_Speed {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number");
            int currentSpeed = sc.nextInt();
            System.out.println("Enter Second number");
            int threshold = sc.nextInt();

            if (currentSpeed > threshold) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
