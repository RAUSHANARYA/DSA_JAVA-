package arrays;
import java.util.*;

public class lc_1_TwoSum 
{
	public static int[] twoSum(int arr[],int t)
	{
		HashMap<Integer,Integer> imap = new HashMap<>();
		int n = arr.length;
		for(int i =0;i<n;i++)
		{
			int diff = t-arr[i];
			if(imap.containsKey(diff))
			{
				return new int [] {imap.get(diff),i};
			}
			imap.put(arr[i],i);
		}
		return new int [] {};
	}
   public static void main ( String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int arr[] = new int [n];
	   
	   for(int i =0;i<n;i++)
	   {
		   int x = sc.nextInt();
		   arr[i] = x;
	   }
	   int t = sc.nextInt();
	   
	   int ans[] = twoSum(arr,t);
	   System.out.println(Arrays.toString(ans));
	   
	   sc.close();
   }
}
