/* Chef wants to become fit for which he decided to walk to 
the office and return home by walking. It is known that Chef's office is 
X km away from his home.
If his office is open on 5
5 days in a week, find the number of kilometers Chef travels through 
office trips in a week. */

import java.util.Scanner;

public class Fitness {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for (int i = 0; i < testCase; i++){
		    int km = sc.nextInt();
		    
		    int totalKm = km * 10;
		    System.out.println(totalKm);
		}
	}
}

