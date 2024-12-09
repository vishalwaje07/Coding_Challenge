import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUsingSet {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 2, 3, 3, 4, 5, 5, 5, 6 };
        Set<Integer> distincSet = new HashSet<>();

        int index = 0;

        for (Integer a : arr) {
            if (!distincSet.add(a)) {
                arr[index++] = null;

            } else {
                arr[index++] = a;
            }
        }
        Arrays.sort(arr, (a, b) -> {
            if (a == null)
                return 1;
            if (b == null)
                return -1;
            return a.compareTo(b);
        });
        System.out.println(Arrays.toString(arr));
    }

}
