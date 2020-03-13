
import java.util.Scanner;
public class ArrayStack implements Stack
{
	private String array[];
	private int top;
	
	public ArrayStack(int capacity)
	{
		array=new String[capacity];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
			else
				return false;
	}
	
	public int size()
	{
		return top+1;
	}
	public String peek()
	{
		return array[top];
	}
	public String pop()
	{
		String temp=array[top];
		array[top]=null;
		top--;
		return temp;
	}
	public void push(String e)
	{
		top++;
		array[top]=e;
	}
	public void display()
	{
	System.out.println("The elements are:");	
	 for(int i=0;i<=top;i++)
	 {
	 	System.out.println(array[i]);
	 }
	}
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int num=scan.nextInt();
		
	ArrayStack stak=new ArrayStack(num);
    
    System.out.println("Enter the array elements");
    for(int i=0;i<num;i++)
    {
    	String str=scan.next();
    	stak.push(str);
    }
    stak.display();
    System.out.println("The size is "+ stak.size());
    System.out.println("The top element is "+ stak.peek());
    System.out.println(stak.pop());
    System.out.println(stak.isEmpty());
}
}