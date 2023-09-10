/* Chef and Chefina are playing with dice. 
In one turn, both of them roll their dice at once.
They consider a turn to be good if the sum of the numbers on 
their dice is greater than 6
Given that in a particular turn Chef and Chefina got 
X and Y on their respective dice, find whether the turn was good. */

import java.util.*;
public class Good_Turn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times do you want to add numbers");
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if( X + Y > 6){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    
}
