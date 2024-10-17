import java.util.*;
public class lengthoflongestSubString {
	public static int length(String s) {
		int c=0;
		String str="";
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					str=str+s.substring(i,j);
					str=str.trim();
					 System.out.println(str);
					c=str.length();
					//return c;
				}
			}
		}
		return c;
	}
	public static void main(String args[])
	{
		 Scanner in=new Scanner(System.in);
		 String s;
		 System.out.println("enter string");
		 s=in.nextLine();
		 int ans=length(s);
		 System.out.println(+ans);
	}
}
