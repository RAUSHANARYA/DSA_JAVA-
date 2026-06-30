package array;
import java.util.*;
public class GcdLcm {

	public static int Gcd(int a, int b)
	{
		while(b!=0)
		{
			int rem = a%b;
			a=b;
			b=rem;
		}
		return a;
	}
	public static int lcm(int a,int b)
	{
		return (a*b)/Gcd(a,b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		
	     System.out.println(Gcd(a,b) +" "+ lcm(a,b));
	

		

	}


	}


