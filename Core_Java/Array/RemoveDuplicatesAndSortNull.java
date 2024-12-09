import java.util.Arrays;

public class RemoveDuplicatesAndSortNull {

    public static Integer[] processedArray(Integer[] arr) {
        // Replace with Duplicates
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != null && arr[i].equals(arr[i + 1])) {
                arr[i + 1] = (Integer) null;
            }
        }
        // Rearrange values to the end of array
        int n = arr.length;

        Integer[] result = new Integer[n];
        int index = 0;

        // Adding values to the end
        for (Integer value : arr) {
            if (value != null) {
                result[index++] = value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 2, 3, 3, 4, 5, 5, 5, 6 };
        System.out.println("Original Array : " + Arrays.toString(arr));
        arr = processedArray(arr);
        System.out.println("Processed Array : " + Arrays.toString(arr));
    }
}
