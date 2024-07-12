import java.util.*;

public class Button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter button number");
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Vishal");
        } else if (button == 2) {
            System.out.println("Krishna");
        } else if (button == 3) {
            System.out.println("Madhav");
        } else {
            System.out.println("Invalid Button");
        }
    }
}
