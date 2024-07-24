import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Number_Prefix {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(63, 74, 22, 46, 78, 31, 68, 34, 56, 23, 54, 76, 23);

        List<Integer> num_With_2 = numbers.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2"))
                .map(Integer::valueOf)
                // :: It is method refrence operator
                .collect(Collectors.toList());
        // It is for collect the result

        System.out.println("The numbers started with 2: " + num_With_2);

        List<Integer> num_With_7 = numbers.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("7"))
                .map(Integer::valueOf)
                // :: It is method refrence operator
                .collect(Collectors.toList());
        // To collect the result

        System.out.println("The numbers stared with 7: " + num_With_7);
    }
}
