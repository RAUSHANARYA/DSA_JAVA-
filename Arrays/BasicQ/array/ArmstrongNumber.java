package array;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static boolean Armstrong(int n )
	{
		String s = String.valueOf(n);
		int l = s.length();
		int sum =0;
		for(int i =0;i<l;i++)
		{
			int digit = s.charAt(i)-'0';
			sum+=Math.pow(digit, l);
		}
		return sum==n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean Armstrongno = Armstrong(n);
		if(Armstrongno)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("non Armstrong");
		}
	}

}
