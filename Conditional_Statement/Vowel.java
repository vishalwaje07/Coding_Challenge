import java.util.*;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Charater");
        char vowel = sc.next().charAt(0);

        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not Vowel");
        }
    }
}