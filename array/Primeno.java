import java.util.*;
public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int c=0;
		System.out.println("enter the starting no. & endind no.");
		int s=in.nextInt();
		int e=in.nextInt();
		for(int i=s;i<=e;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				c++;	
			}
			if(c==2)
				System.out.println("prime no. between" +s +"&" +e +"are =" +i);
		}
		
	}

}
