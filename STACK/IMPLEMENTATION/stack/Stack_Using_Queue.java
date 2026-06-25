package stack;
import java.util.*;

public class Stack_Using_Queue
{
	public void push(int x)
	{
		q.offer(x);
		int size = q.size()-1;
		for(int i=0;i<size;i++)
		{
			q.offer(q.remove());
		}
		
	}
	
	// pop
	public void pop()
	{
		if(q.isEmpty()) System.out.println("Stack Underflow");
		System.out.println(q.poll());
	}
	
	//peek 
	public void peek()
	{
		if(q.isEmpty()) System.out.println("Stack Underflow");
		System.out.println(q.poll());
	}
	//size
	public void size()
	{
		if(q.isEmpty()) System.out.println("Stack Underflow");
		System.out.println(q.size());
	}
	
   Queue<Integer> q = new LinkedList<>();
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		Stack_Using_Queue st = new Stack_Using_Queue();
		
		
		for(int i =0;i<q;i++)
		{
			String s = sc.next();
			if(s.equals("push"))
			{
				int x = sc.nextInt();
				st.push(x);
			}
			else if(s.equals("pop"))
			{
				st.pop();
			}
			else if(s.equals("top"))
			{
				st.peek();
			}
			else if(s.equals("size"))
			{
				st.size();
			}
		}

	}

}
