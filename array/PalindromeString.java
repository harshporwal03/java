import java.util.*;
public class PalindromeString {
public static void Palindrome(String s)
{
	String st="";
    for(int i=s.length()-1;i>=0;i--)
    {
    	st=st+s.charAt(i);
    }
    if(st.equals(s))
    {
    	System.out.println("String: '"+s+"' ,is Palindrome");
    }
    else
    {
    	System.out.println("String: '"+s+"' ,is not Palindrome");	
    }
}
public static void main(String args[])
{
	 Scanner in=new Scanner(System.in);
	 String s;
	 System.out.println("enter string");
	 s=in.nextLine();
	 Palindrome(s);
}
}
