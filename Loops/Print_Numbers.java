import java.util.Scanner;

public class Print_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}