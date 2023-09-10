/* The doctor advised Chef to drink at least 2000
2000 ml of water each day.Chef drank 
X ml of water today. Determine if Chef followed the doctor's advice or not. */

import java.util.*;

public class Water_Consumption {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many times do you want to add numbers");
            int testCase = sc.nextInt();

            for (int i = 0; i < testCase; i++) {
                int X = sc.nextInt();

                if (X >= 2000) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

}
