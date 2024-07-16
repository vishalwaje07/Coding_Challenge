public class ArrayEqual_OrNot_Loop {
    public static void main(String[] args) {
        int array1[] = { 1, 2, 3, 4, 5 };
        int array2[] = { 1, 2, 3, 4, 5 };

        boolean status = true;

        if (array1.length == array2.length) {

            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    status = false;
                }
            }
        } else {
            status = false;
        }
        if (status == true) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are NOT equal");
        }

    }

}
