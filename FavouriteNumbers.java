
/* 
Alice likes numbers which are even, and are a multiple of 7.
Bob likes numbers which are odd, and are a multiple of 9.
Alice, Bob, and Charlie find a number A.
If Alice likes A, Alice takes home the number.
If Bob likes A, Bob takes home the number.
If both Alice and Bob don't like the number, Charlie takes it home.
*/
import java.util.*;

public class FavouriteNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for (int i = 0; i < A; i++) {
            int num = sc.nextInt();
            if (A % 2 == 0 && A % 7 == 0) {
                System.out.println("Alice");
            } else if (A % 2 != 0 && A % 9 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }
    }
}
