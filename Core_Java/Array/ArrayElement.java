public class ArrayElement {
    // Array element is present or not.
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 7;

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}