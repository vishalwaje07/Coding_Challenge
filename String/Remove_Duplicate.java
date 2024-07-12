import java.util.Scanner;

public class Remove_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = sc.nextLine();

        StringBuilder sb1 = new StringBuilder();

        str.chars().distinct().forEach(c -> sb1.append((char) c));

        System.out.println(sb1);

    }
}