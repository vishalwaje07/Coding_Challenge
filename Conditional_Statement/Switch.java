import java.util.*;

import javax.sound.midi.Soundbank;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Vishal");
                break;
            case 2:
                System.out.println("Krishna");
                break;
            case 3:
                System.out.println("Madhav");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
