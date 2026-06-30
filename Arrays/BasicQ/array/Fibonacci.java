package array;

import java.util.Scanner;

public class Fibonacci {
   
	public static void fib(int n )
	{
		int a = 0;
		int b =1;
		for(int i =0;i<=n;i++)
		{
			System.out.print(a+" ");
			int c = a+b;
			a=b;
			b=c;
		}
	}
	
	// nth fibbonaci / climbing starirs
	 
	public static int NthFib(int n)
	{
		if(n==0)return 0;
		if(n==1) return 1;
		
		 // if climbing q then just start with 1,1 if 0 n 1 // but in fib 0 =0 , 1=1 
//		 if(n<=1) return 1;
		int a=0;
		int b=1;
		for(int i =2;i<=n;i++)
		{
			int c = a+b;
			a=b;
			b=c;
			
		}
		return b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    fib(n);
       sc.close();
		

	}

}
