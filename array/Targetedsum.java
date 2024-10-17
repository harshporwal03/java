import java.util.*;
public class Targetedsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("Enter Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("enter targeted sum");
		int s=in.nextInt();
		for(int k=0;k<n;k++)
		{
		for(int i=0;i<a.length;i++)
		    {
			if(a[k]+a[i]==s)
				System.out.println(k + "," + i);
		    }}
	}

}

