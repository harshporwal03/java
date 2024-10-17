import java.util.*;
public class InitialsString {
 public static String initial(String s)
 {
	 s=" "+s;
	 String st="";
	 int len=s.length();
	 for(int i=0;i<len;i++)
	 {
		 if(s.charAt(i)==' ')
		 {
			 st=st+s.charAt(i+1);
		 }
	 }
	 st=st.toUpperCase();
	 return st;
 }
 public static void main(String args[])
 {
	 Scanner in=new Scanner(System.in);
	 String s;
	 System.out.println("enter string");
	 s=in.nextLine();
	 String Initial=initial(s);
	 System.out.println(Initial);
 }
}
