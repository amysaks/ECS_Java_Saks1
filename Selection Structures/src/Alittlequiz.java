import java.util.Scanner;

public class Alittlequiz
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int capaka,cca,doughnut ;
	
		System.out.println("Please enter your name. ");
		name = keyboard.next();
		
		System.out.println("What is the capital of Alaska? ");
		System.out.println("1). Poland ");
		System.out.println("2) Juneau ");
		System.out.println("3) South Africa ");
		System.out.println("4) Alaska is fake ");
		capaka = keyboard.nextInt();
	
		if ((capaka < 2) || (capaka > 2 ))
		{
			System.out.println("That is incorrect. The correct answer is Juneau.");
		}
		else 
		{
			System.out.println("Correct.");
		}
		System.out.println("What does CCA stand for? ");
		System.out.println("1). Crest Canyon Academy ");
		System.out.println("2) Cool Cids Anonymus ");
		System.out.println("3) Canyon Crack Academy ");
		System.out.println("4) Canyon Crest Academy ");
		capaka = keyboard.nextInt();
	
		if (capaka < 4) 
		{
			System.out.println("That is incorrect. The correct answer is Canyon Crest Academy.");
		}
		else 
		{
			System.out.println("Correct.");
		}
		System.out.println("What is the most popular doughnut flavor? ");
		System.out.println("1). Chocolate ");
		System.out.println("2) Raspberry Jelly ");
		System.out.println("3) Glazed ");
		System.out.println("4) Apple ");
		capaka = keyboard.nextInt();
	
		if ((capaka < 3) || (capaka > 3 ))
		{
			System.out.println("That is incorrect. The correct answer is Glazed.");
		}
		else 
		{
			System.out.println("Correct.");
		}
	}
}