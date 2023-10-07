/*Given A,B, and C as the sides of a triangle, 
find whether the triangle is scalene.
Note:
A triangle is said to be scalene if all three sides of the triangle are distinct.
It is guaranteed that the sides represent a valid triangle.
 */
import java.util.*;
public class ScaleneTriangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ( a!=b && b!=c && c!=a){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
    
}
