import java.util.Scanner;

public class Dumbcalculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int n1, n2, n3;
		double average;
		
			
		System.out.println("First Number ");
		n1 = keyboard.nextInt();
		
		System.out.println("Second Number ");
		n2 = keyboard.nextInt();
		
		System.out.println("Third Number ");
		n3 = keyboard.nextInt();
		
		average= (n1 +n2 + n3) / 3.0;
		System.out.println("The average of those numbers are? " + average);
		
		
	}

}
