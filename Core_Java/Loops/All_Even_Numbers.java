import java.util.*;

public class All_Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();  

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}