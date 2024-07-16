import java.util.Arrays;

public class Array_Equal_Or_Not {
    public static void main(String[] args) {
        int array1[] = { 1, 2, 3, 4, 5 };
        int array2[] = { 1, 2, 3, 4, 5 };

        boolean status = Arrays.equals(array1, array2);

        if (status == true) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

}
