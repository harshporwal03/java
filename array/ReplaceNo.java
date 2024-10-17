import java.util.*;
public class ReplaceNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		int a,b;
		System.out.println("enter 2 nos.");
		a=in.nextInt();
		b=in.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a + " " + b);
		

	}

}
