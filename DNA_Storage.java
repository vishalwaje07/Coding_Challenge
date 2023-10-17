/*For encoding an even-length binary string into a sequence of 
A, T, C, and G, we iterate from left to right and replace the 
characters as follows:

00 is replaced with A
01 is replaced with T
10 is replaced with C
11 is replaced with G
Given a binary string S of length 
N (N is even), find the encoded sequence. */

import java.util.*;
public class DNA_Storage{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N =sc.nextInt();
            String S = sc.nextLine();

            for(int i = 0; i<S.length(); i=i+2){
                char a = S.charAt(i);
                char b = S.charAt(i+1);
                if(a==0 && b==0) System.out.println("A");
                if(a==0 && b==1) System.out.println("B");
                if(a==1 && b==0) System.out.println("C");
                if(a==1 && b==1) System.out.println("G");
            }
        }
    }
}