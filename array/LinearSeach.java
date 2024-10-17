import java.util.*;
public class LinearSeach {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		int n,i,x,c=0;
		System.out.println("enter no of elements");
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements in array");
		for(i=0;i<n;i++) 
		{
			a[i]=in.nextInt();
		}
		System.out.println("enter element you want to search");
		x=in.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x) 
			{
		     System.out.println("Element found at pos: "+(i+1));
		     c++; 
			}
		}
		if(c==0)
		System.out.println("element not found");
	}

}
