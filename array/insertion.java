import java.util.*;
import java.util.Arrays;  
public class insertion {
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
         int b[]=new int[n+1];
         
    	System.out.println("enter the element you want to add");
         x=in.nextInt();
         System.out.println("enter the position at which you want to add the element");
        int pos=in.nextInt();
        
        int j=0;
        for(i = 0; i<b.length; i++) {  
        	if(i==pos) {  
        	b[i] = x;  
        	}else {  
        	b[i] = a[j];  
        	j++;  
        	}}
       
        System.out.println("After Insert: "+Arrays.toString(b) );
    }
}



