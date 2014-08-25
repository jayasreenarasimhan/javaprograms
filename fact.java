import java.util.*;
class fact
{
	public static void main(String args[])
	{		
		int n, i, res;
		int product = 1;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter a No.");
		n=scan.nextInt();
		int count = 0;
		for(i=n;i>0;i--)
		{
			count ++;
			product = product * n;
			n = n - 1;
		}
		System.out.println(count + "! = " + product);
		
		//
		//somemore changes
	}
}
