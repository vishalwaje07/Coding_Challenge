public class Missing_Number {
    public static void main(String[] args) {
        // Array should not have duplicates.
        // Array No need to be in sorted order.
        // Values should be in range.

        int array1[] = { 1, 2, 4, 5 };
        /*
         * LOGIC:
         * sum1 = 1 + 2 + 4 + 5 = 12
         * sum2 = 1 + 2 + 3 + 4 + 5 =15
         * sum2 - sum1 = 15 - 12 = 3
         */
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 = sum1 + array1[i];
        }
        // System.out.println(sum1);

        int sum2 = 0;
        for (int i = 1; i <= 5; i++) {
            sum2 = sum2 + i;
        }
        // System.out.println(sum2);
        System.out.println(sum2 - sum1 + " : this is missing number");
    }
}
