import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate_Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 2, 1, 4, 6, 3, 1);

        Set<Integer> duplicate_Numbers = numbers.stream()
                .filter(e -> Collections
                        .frequency(numbers, e) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicate_Numbers);

    }

}