import java.util.Scanner;

public class Advanced_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();

        for (int i = 0; i <= number; i = i + 2) {
            System.out.println(i);
        }
    }
} 