package array;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n )
	{
		if(n<0) return 0;
//		if(n==1||n==0) return 1;
//			
//		return n*factorial(n-1);
		
		
		// 2nd method
		int fact = 1;
		for(int i =2;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println(result );


	}

}
