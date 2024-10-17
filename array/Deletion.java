import java.util.*;
public class Deletion {
	 public static void main(String args[])
	    {
	    	Scanner in=new Scanner(System.in);
	    	int n,x,i;
	    	System.out.println("enter the no. of elements in array");
	    	n=in.nextInt();
	    	int a[]=new int[n];
	    	System.out.println("enter the array");
	    	for(i=0;i<n;i++)
	    	{
	    		a[i]=in.nextInt();
	    	}
	    	System.out.println("Original Array: "+Arrays.toString(a));  
	    	
	    	System.out.println("enter the pos of element you want to delete");
	    	x=in.nextInt();
            
	    	if(a.length<=0 || x>n || x<0)
	    	{
	    		System.out.println("deletion not possible");
	    	}
	    	
	    	else 
	    	{ 
	    		//METHOD 1
	    		
	    	 /* 
	    	    int b[]=new int[n-1];
	    		int j=0;
	    		for(i=0;i<n;i++)
	    		{
	    			if(i!=x)
	    			{
	    				b[j]=a[i];
	    				j++;
	    			}
	    		}   
	    		a=b;  
	    		
	    	    System.out.println("After Deletion: ");
	    	    for(i=0;i<n;i++)
	    	    {
	    	    	System.out.print(a[i]+" ");
	    	    }
	    	 */
	    		
	    		//METHOD 2
	    		
	    	for(i=0;i<n;i++)
	    	{
	    		if(i==x)
	    		{
	    		for(int j=i;j<n-1;j++)
	    		{
	    			a[j]=a[j+1];
	    		}
	    		break;
	    		}
	    	}
	    	
	    	System.out.println("After Deletion: ");
	    	for(i=0;i<n-1;i++)
	    	{
	    		System.out.print(a[i]+" ");
	    	}
	    	}
}
}
