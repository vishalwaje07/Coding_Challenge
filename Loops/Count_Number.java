import java.util.Scanner;

public class Count_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int count = 0;

        int number = sc.nextInt();
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);
        // System.out.println(String.valueOf(number).length());
    }
}
