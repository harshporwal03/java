import java.util.*;
class reverse_words_in_a_string
{
  public static String reverseWords(String s) {
    s=s+" ";
    int l=s.length();
    String t="",rev="";
    for(int i=0;i<l;i++)
    {
      t=t+s.charAt(i);
      if(s.charAt(i)==' ')
      {
        t=t.trim();
        for(int j=t.length()-1;j>=0;j--)
        {
          rev=rev+t.charAt(j);
        }
        t="";
        rev=rev+" ";
      }
     }
    return rev.trim();
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enetr a Sentence: ");
    String s;
    s=in.nextLine();
    String ans=reverseWords(s);
    System.out.println("the reversed sentence is: " +ans);
  }
}