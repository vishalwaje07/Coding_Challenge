import java.util.*;

public class Hello {
    public static void main(String args[]) {
        System.out.println("Enter something");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("You have entred : " + str);
    }
}