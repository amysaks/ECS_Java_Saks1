import java.util.Scanner;
public class CountingMachine 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in) ;
		int num;
		System.out.println("Count to: ");
		num = keyboard .nextInt();
		
		for (int n= 1; n <= num; n = n + 1)
		{
			System.out.print(n +" ");
			keyboard.close();
		}
	}
	

}
