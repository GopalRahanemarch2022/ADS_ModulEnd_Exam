import java.util.*;
class LL
{
	static Node head;
	
	static class Node
	{
		int data;
		Node add;
		
		Node(int d)
		{
			data=d;
			add=null;
		}
	}
	
	void addNode(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			while(temp.add!=null)
			{
				temp=temp.add;
			}
			temp.add=newNode;
		}
	}
	Node reverse(Node node)
	{
		Node prev=null;
		Node current=node;
		Node add=null;
		while(current!=null)
		{
			add=current.add;
			current.add=prev;
			prev=current;
			current=add;
		}
		node=prev;
		return node;
	}
	
	void printList(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.add;
		}
		System.out.println();
	}
	public static void main(String[]args)
	{
		LL list=new LL();
		Scanner sc =new Scanner(System.in);
		int tcase=sc.nextInt();
		for(int i=0;i<tcase;i++)
		{
			int n=sc.nextInt();
			for(int j=0;j<n;j++)
			{
				int x=sc.nextInt();
				list.addNode(x);
			}
			head=list.reverse(head);
			list.printList(head);
		}
	}
}