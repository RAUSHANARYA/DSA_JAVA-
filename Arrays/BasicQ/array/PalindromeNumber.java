package array;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static boolean palindrome(int n)
	{
		int m =n;
		int rev = 0;
		while(n>0)
		{
			int digit = n%10;
			rev = rev*10+digit;
			n=n/10;
		}
		return m==rev;
	}
	
	public static boolean palindrome1(int n )
	{
		String s = String.valueOf(n);
		int len = s.length();
		int l=0;
		int r = len-1;
		while(l<r)
		{
			if(s.charAt(l)!=s.charAt(r)) return false;
			l++;
			r--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result = palindrome1(n);
		System.out.println(result);
     sc.close();
	}

}
