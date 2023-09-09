/* fibonacci series, next number is the sum of previous two 
numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
The first two numbers of fibonacci series are 0 and 1 */
public class FibonacciWithoutRecursion {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3, count = 10;
        System.out.println(num1 + " " + num2);

        for (int i = 0; i < count; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }

}
