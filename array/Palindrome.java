import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int s=0;
		System.out.println("ENTER ANY NUMBER");
		int n=in.nextInt();
		int num=n;
		while(n!=0)
		{
			int r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		
		System.out.println("PALINDROME NO.=" +s);

	}

}
