// 1/2 + 3/4 + 5/6 
public class Result_Of {
    public static void main(String[] args) {
        double sum = 0;

        for (double i = 1; i <= 10; i++) {
            sum = sum + i * (i + 1);
        }
        System.out.println(sum);
    }
}