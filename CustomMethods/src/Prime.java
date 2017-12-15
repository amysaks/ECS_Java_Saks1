  import java.util.Scanner;
public class Prime
      {
          public static void main( String[] args )
          
          {
        	  Scanner keyboard = new Scanner(System.in);
        	  System.out.println("We are going to find some Primes");
        	  System.out.println( " What range would you like them in?");
        	  System.out.println( "Only positive integers 2 or greater");
        	  
        	  int num1,num2;
        	  
        	  System.out.print( "Low End: ");
        	  	num1 = keyboard.nextInt();
        	  System.out.print( "High End: ");
        	  	num2 = keyboard.nextInt();
        	  
              for ( int n = num1; n <= num2; n++ )
              {
                  if (isPrime(n)) {
                      System.out.println( n + " <");
      
                  } else {
                      System.out.println( n );
                  }
              }   
          }
      
          public static boolean isPrime (int n )
          {
              for (int x = 2; x < n;x++)
              {
                  if (n%x == 0) 
                  {
                      return false;
                  }
              }
              return true;
          }
      }  


