import java.util.*;
public class TwoSum {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int i,j,n,n2,c=0;
		System.out.println("enter the no. of elements of array 1");
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements of array");
		for(i=0;i<n;i++) 
		{
			 a[i]=in.nextInt();
		}
		System.out.println("enter the element you want to find the sum of");
		int x=in.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==x)
				{
					System.out.println("the index is:"+i +" "+ j);
				}
			}
		}
}
}