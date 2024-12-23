import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicateCharArray {
    public static void main(String[] args) {
        String[] input = { "P", "r", "o", "g", "r", "a", "m", "m", "i", "n", "g" };

        String result = IntStream.range(0, input.length)
                .mapToObj(i -> input[i])
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(result);

    }

}
