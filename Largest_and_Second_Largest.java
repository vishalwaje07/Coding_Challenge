
/*You are given an array A of N integers.
Find the maximum sum of two distinct integers in the array.
Note: It is guaranteed that there exist at least two distinct integers in the array. */
import java.util.*;

public class Largest_and_Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();

            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = N - 1; i >= 0;) {
                if (arr[i] != arr[i - 1]) {
                    System.out.println(arr[i] + arr[i - 1]);
                    break;
                } else {
                    i--;
                }
            }
        }
    }

}
