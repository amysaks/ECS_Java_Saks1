import java.util.Random;
import java.util.Scanner;

public class Numbguesscount 
{
	public static void main( String[] args )
	{
		 Scanner keyboard = new Scanner(System.in);
			Random r = new Random();
			int number = 1 + r.nextInt(10);
			int guess;
			int numtries = 0;
			
		 System.out.println("I'm thinking of a number between 1-10. Try to guess it!");
		 guess=keyboard.nextInt();
		 
		 do 
		 {
			 System.out.println("Try Again!");
			 guess=keyboard.nextInt();
			 numtries++;
		 }
		 while (number != guess );
		 
			 System.out.println("Correct! It took you " + numtries + " tries to guess the correct number.");
		 
	}

}
