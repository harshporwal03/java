
import java.util.*;
public class WordExtract {
public static void word(String s)
{
	s=s+' ';
	int c=0;
	String st="";
	int len=s.length();
	for(int i=0;i<len;i++)
	{
		 st = st + s.charAt(i);
		if(s.charAt(i)==' ')
		{
		    st=st.trim();
			c++;
			System.out.println("word "+c+" is: "+st);
			st="";
		}
	}
	System.out.println("total words: "+c);
}
public static void main(String args[])
{
	Scanner in=new Scanner (System.in);
	String s;
	System.out.println("Enter a Sentence");
	s=in.nextLine();
	word(s);
}
}  


/*import java.util.Scanner;

public class WordExtract {
    public static void word(String s) {
        s = s + ' ';
        int c = 0;
        String st = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                st = st.trim();
                if (!st.isEmpty()) { // Check if the word is not empty
                    c++;
                    System.out.println("Word " + c + " is: " + st);
                }
                st = ""; // Reset the word
            } else {
                st = st + s.charAt(i);
            }
        }
        System.out.println("Total words: " + c);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Enter a Sentence:");
        s = in.nextLine(); // Use nextLine() to read the entire sentence
        word(s);
    }
}*/