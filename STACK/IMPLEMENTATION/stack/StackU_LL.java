package stack;
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node (int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class StackU_LL
{
	Node top;
	int size ;
	
	StackU_LL(int size)
	{
		this.top = null;
		this.size = size;
	}
	
	//push
	public void push(int x)
	{
		
		Node newNode = new Node(x);
		newNode.next=top;
		top = newNode;
	
	}
		
	// pop 
	
	public void pop()
	{
		if(top==null) 
		{
			System.out.println("STACK IS EMPTY");
			return;
		}
		top = top.next;
	}
	
	// peek 
	public void peek()
	{
		if(top==null) 
		{
			System.out.println("STACK IS EMPTY");
			return;
		}
		System.out.println(top.data);
	}
	
	// display 
	public void display()
	{
		if(top==null) 
		{
			System.out.println("STACK IS EMPTY");
			return;
		}
		Node curr = top;
		
		while( curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
   public static void main (String args[])
   {
	  Scanner sc = new Scanner(System.in); 
	  int Q = sc.nextInt();//size
	  StackU_LL st = new StackU_LL(Q);
	  
     for(int i=0;i<Q;i++)
     {
    	 String s= sc.next();
    	 if(s.equals("PUSH"))
    	 {
    		 int x = sc.nextInt();
    		 st.push(x);
    	 }
    	 else if(s.equals("POP"))
    	 {
              st.pop();
    	 }
    	 else if(s.equals("PEEK"))
    	 {
    		 st.peek();
    	 }
    	  else if (s.equals("DISPLAY")) {
               st.display();
           }
    	 
     
     
     }
	  
sc.close();
	  
   }

	
}
