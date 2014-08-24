import java.util.*;
class factorial
{
	public static void main(String args[])
	{		
		int n, c, fact = 1	;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter a No.");
		n=scan.nextInt();
		if ( n < 0 )
		{
			System.out.println("Number should be non-negative.");
		}
        else
         {
			 for ( c = 1 ; c <= n ; c++ )
			 {
				fact = fact*c;
			 } 
			 System.out.println("Factorial of "+n+" is = "+fact);
		 }
	}
}
