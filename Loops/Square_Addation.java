// 1^2 + 2^2 + 3^3 + 4^2
public class Square_Addation {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum = sum + i * i;
        }
        System.out.println(sum);
    }
}