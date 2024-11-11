public class ArrayElement {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int target = 9;

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Element is found");
        } else {
            System.out.println("Element not found ");
        }
    }
}