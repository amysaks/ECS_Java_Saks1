import java.util.Random;
import java.util.Scanner;

public class keepguessing
{
	public static void main( String[] args )
	{
		 Scanner keyboard = new Scanner(System.in);
			Random r = new Random();
			int number = 1 + r.nextInt(10);
			int guess;
			
		 System.out.println("I'm thinking of a number between 1-10. Try to guess it!");
		 guess=keyboard.nextInt();
		 
		 while (number != guess )
		 {
			 System.out.println("Try Again!");
			 guess=keyboard.nextInt();
		 }
		 if (number == guess )
		 {
			 System.out.println("Correct!");
		 }
	}

}
