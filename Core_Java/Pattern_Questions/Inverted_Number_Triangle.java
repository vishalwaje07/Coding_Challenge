
public class Inverted_Number_Triangle {
    public static void main(String[] args) {
        // Rows
        int rows = 5;
        // Number
        int number = 1;

        // Outer for Loop
        for (int i = rows; i >= 1; i--) {

            // Inner For loop
            for (int j = 1; j <= i; j++) {

                // Printing the Numbers
                System.out.print(number + " ");

                // Increasing the value
                number++;
            }
            // Adding the space
            System.out.println();
        }

    }
}
