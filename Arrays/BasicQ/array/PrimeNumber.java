package array;
import java.util.*;

public class PrimeNumber
{
	public static boolean prime(int n )
	{
		if(n<0) return false;
	
		int count =0;
		for(int i =1;i<=n;i++)
		{
			if(n%i==0) count++;
			
		}
		return count==2;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean prime = prime(n);
		if(prime)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("non prime");
		}
	}
}
