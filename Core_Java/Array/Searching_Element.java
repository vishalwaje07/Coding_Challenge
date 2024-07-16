import java.util.*;

public class Searching_Element {
    public static void main(String[] args) {
        int array[] = { 10, 20, 30, 40, 50 };
        System.out.println("Enter which element you have to find");
        Scanner sc = new Scanner(System.in);
        int search_element = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            if (search_element == array[i]) {
                System.out.println("Element found at : " + array[i]);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Element Not Found");
        }
    }

}
