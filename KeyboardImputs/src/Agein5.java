import java.util.Scanner;

public class Agein5
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, agep5, agem5;
			
		System.out.println("What is your name? ");
		name = keyboard.next();
		
		System.out.println("How old are you? ");
		age = keyboard.nextInt();
		agep5= age +5;
		agem5 = age - 5;
		
		System.out.println("Well, " + name + " did you know that in 5 years you will be " + agep5  + ", and 5 years ago you were " + agem5 );
	}
}
