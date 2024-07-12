import java.util.*;

public class Simple_If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You can Drive");
        } else {
            System.out.println("You can't drive");
        }
    }

}
