import java.util.*;
class fibonacci
{
	public static void main(String args[])
	{		
		int n, i;
		int output = 1;
		int temp = 1;
		int temp1 = 0;
		boolean flag=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter a No.");
		n=scan.nextInt();
		
		System.out.println(" fibonacci sequence number for 0 is = 0");
		System.out.println(" fibonacci sequence number for 1 is = 1");
		for(i=1;i<n;i++)
		{
			temp1 = output;
			output = output + temp;
			int count = i+1;
			System.out.println(" fibonacci sequence number for " + count + " is = " + output);
			temp = temp1;
		}
	}
}
