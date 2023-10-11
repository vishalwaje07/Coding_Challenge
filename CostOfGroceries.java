
/*Chef visited a grocery store for fresh supplies. There are 
N items in the store where the 
ℎi th item has a freshness value A i and cost B i.
Chef has decided to purchase all the items having a freshness value greater than equal to 
X. Find the total cost of the groceries Chef buys.

 */
import java.util.*;

public class CostOfGroceries {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();

            int[] A = new int[n];
            int[] B = new int[n];

            int total_cost = 0;

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (A[i] >= x) {
                    total_cost += B[i];
                }
            }
            System.out.println(total_cost);
        }
    }

}
