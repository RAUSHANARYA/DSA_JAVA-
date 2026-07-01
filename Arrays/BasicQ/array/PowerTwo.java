package array;
import java.util.Scanner;

public class PowerTwo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n%2==0)
		{
			n=n/2;
		}
		if(n==1) {System.out.println("yes");}
		else  {System.out.println("No");}

	}

}
