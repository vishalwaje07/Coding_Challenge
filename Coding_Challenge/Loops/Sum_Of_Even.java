public class Sum_Of_Even {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                result = result + i;
            }
        }
        System.out.println(result);
    }
}