
/* 
 * In Chefland, a valid phone number consists of 5
5 digits with no leading zeros.
For example, 
98765
10000
98765,10000, and 
71023
71023 are valid phone numbers while 
04123
9231
04123,9231, and 
872310
872310 are not.
Chef went to a store and purchased 
N items, where the cost of each item is 
X.
Find whether the total bill is equivalent to a valid phone number.
 */
import java.util.*;

public class SevenRings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int totalBill = x * y;
            if (totalBill >= 10000 && totalBill <= 99999) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
