import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String reversedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString = reversedString + str.charAt(i);
        }
        System.out.println("Original String is : " + str);
        System.out.println("Reveresed String is : " + reversedString);
    }
}