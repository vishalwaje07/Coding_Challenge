/*Alice and Bob recently got into running, and decided to compare how much 
they ran on different days.They each ran for 
N days — on the ℎi th day, Alice ran A i meters and Bob ran B i meters.
On each day,
Alice is unhappy if Bob ran strictly more than twice her distance, and happy otherwise.
Similarly, Bob is unhappy if Alice ran strictly more than twice his distance, and happy otherwise. */

import java.util.*;

class Running_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Values");
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();

            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int B[] = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                int d_Alice = A[i] * 2;
                int d_Bob = B[i] * 2;

                if (B[i] <= d_Alice && A[i] <= d_Bob) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}