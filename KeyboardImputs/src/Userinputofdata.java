import java.util.Scanner;

public class Userinputofdata 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name, lastname,login;
		int grade,userid;
		double gpa;
			
		System.out.println("First Name ");
		name = keyboard.next();
		
		System.out.println("Last Name ");
		lastname = keyboard.next();
		
		System.out.println("Current Grade ");
		grade = keyboard.nextInt();
		
		System.out.println("User Login ");
		login = keyboard.next();
		
		System.out.println("Student ID ");
		userid = keyboard.nextInt();
		
		System.out.println("GPA ");
		gpa = keyboard.nextDouble();
		
		System.out.println("Your Information");
				System.out.println("Login:" + login);
				System.out.println("Student ID:" + userid);
				System.out.println("Name:" + lastname + ", " + name);
				System.out.println("GPA:" + gpa);
				System.out.println("Grade:" + grade);
				
		keyboard.close();
	}
}
