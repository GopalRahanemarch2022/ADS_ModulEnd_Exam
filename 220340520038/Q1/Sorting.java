import java.util.*;
class Sorting
{
	static void Insort(int a,int []arr)
	{
		for(int i=1;i<a;++i)
		{
			int b=arr[i];
			int c= i-1 ;
			while(c>= 0 && arr[c]>b)
			{
				arr[c+1]=arr[c];
				c=c-1;
				parray(arr);
			}
			arr[c+1]=b;
		}
	}
	
	static void parray(int arr[])
	{
		int size=arr.length;
		for(int i=0;i<size;i++)
		
			System.out.print(arr[i]+" ");
		
				System.out.println();
	}
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Insort(n,arr);
		parray(arr);
		
		
		
	}
}