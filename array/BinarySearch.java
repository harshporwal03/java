import java.util.*;
public class BinarySearch {
	public static void main(String args[])
	{
	    Scanner in = new Scanner (System.in);
		int n,c=0,i,y,min,mid=0,max=0;
		System.out.println("enter no of elements");
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements in array");
		for(i=0;i<n;i++) 
		{
			a[i]=in.nextInt();
		}
		System.out.println("enter element you want to search");
		y=in.nextInt();
		
		min=0;
		max=n-1;
		 mid=(min+max)/2;
		
		
		while(min<=max) {
			   mid=min+(max-min)/2;
			// If y greater, ignore left half
			   if(a[mid]<y) {
					min=mid+1;}
			   
			   else if( a[mid]==y ) 
			   {
				c++;
				System.out.println("Element found at the index:"+(mid+1));
				break;
				}
		
			 // If x is smaller, ignore right half
			   else {
				max=mid-1;}	
		    
		   
		}
		if(c==0)
		System.out.println("Element not found"); 
		
	}
}
