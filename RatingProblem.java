
/* CodeCheffers are aware that after a contest, all problems 
are moved into the platform’s practice section. Based on user 
submissions during the contest, the system calculates and assigns 
a difficulty rating to each problem. Ideally, it is recommended 
that users practice problems in increasing order of difficulty.
​
 . */
import java.util.*;

public class RatingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int done = sc.nextInt();

            int[] arr = new int[done];
            for (int k = 0; k < done; k++) {
                arr[k] = sc.nextInt();
            }
            boolean isNonDecreasing = true;
            for (int j = 1; j < done; j++) {
                if (arr[j] < arr[j - 1]) {
                    isNonDecreasing = false;
                    break;
                }
            }
            if (isNonDecreasing) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
