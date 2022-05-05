import java.util.*;
class Stack
{
	private int arr[];
	private int size;
	private int top1;
	private int top2;
	
	Stack(int size)
	{
		this.size=size;
		arr=new int[size];
		top1=size/2 +1;
		top2=size/2;
	}
	void push1(int a)
	{
		if(top1>0)
		{
			top1--;
			arr[top1]=a;
		}
		else
		{
			System.out.println("Stack overflow with the element "+a);
			return;
		}
	}
	
		void push2(int a)
	{
		if(top2<size-1)
		{
			top2++;
			arr[top2]=a;
		}
		else
		{
			System.out.println("Stack overflow with the element "+a);
			return;
		}
	}
	
	int pop1()
	{
		if(top1<=size/2)
		{
			int b=arr[top1];
			top1++;
			return b;
		}
		else
		{
				System.out.println("Stack underflow ");
				System.exit(1);
		}
		return 0;
	
	}
	int pop2()
	{
		if(top2>=size/2 +1)
		{
			int b=arr[top2];
			top2--;
			return b;
		}
		else
		{
				System.out.println("Stack underflow ");
				System.exit(1);
		}
		return 1;
	
	}
}
class TwoS
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of stack");
		int size=sc.nextInt();
		Stack obj=new Stack(size);
		obj.push1(5);
		obj.push2(10);
		obj.push2(15);
		obj.push1(11);
		obj.push2(7);
		obj.push2(40);
		System.out.println("popped element fromstack1 is "+obj.pop1());
		System.out.println("popped element from stack2 is "+obj.pop2());
		
	}
}