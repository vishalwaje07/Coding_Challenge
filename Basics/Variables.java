import java.util.*;

public class Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer");
        int number = sc.nextInt();

        // Consume the newline character after reading an integer
        sc.nextLine();

        System.out.println("Enter String");
        String str = sc.nextLine();

        System.out.println("Enter character");
        char character = sc.next().charAt(0);

        System.out.println("Enter boolean ");
        boolean bool = sc.nextBoolean();

        System.out.println("Enter Long value ");
        long longValue = sc.nextLong();

        System.out.println("Enter Byte ");
        byte byteValue = sc.nextByte();

        System.out.println("Enter Double");
        double doubleValue = sc.nextDouble();

        System.out.println("Enter short");
        short shortValue = sc.nextShort();

        // Displaying the entered values
        System.out.println(number);
        System.out.println(str);
        System.out.println(character);
        System.out.println(bool);
        System.out.println(longValue);
        System.out.println(byteValue);
        System.out.println(doubleValue);
        System.out.println(shortValue);
    }
}
