//print the common elemets in the given 2 arrays
import java.util.*;
public class IntersectArray {
public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	int i,j,n1,n2,c=0;
	System.out.println("enter the no. of elements of array 1");
	n1=in.nextInt();
	int a[]=new int[n1];
	System.out.println("enter the elements of array 1");
	for(i=0;i<n1;i++) 
	{
		 a[i]=in.nextInt();
	}
	System.out.println("enter the no. of elements of array 2");
	n2=in.nextInt();
	int b[]=new int[n2];
	System.out.println("enter the elements of array 2");
	for(i=0;i<n2;i++) 
	{
		 b[i]=in.nextInt();
	}
	System.out.println("the same elements are:");
	for(i=0;i<n1;i++)
	{
		for(j=0;j<n2;j++)
		{
			if(a[i]==b[j])
			{
				if(c==a[i]) {
					continue;}
				else {
				System.out.print(+a[i]+" ");}
				c=a[i];
			}
		}
	}
}
}
