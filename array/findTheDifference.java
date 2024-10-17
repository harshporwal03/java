import java .util.*;
public class findTheDifference {
  public static char getDifference(String s, String t) {
   int sumS=0;
   int sumT=0;

   for(int i=0; i<s.length(); i++) {
    int ch=s.charAt(i);
    sumS+=ch;
  }

  for(int i=0; i<t.length(); i++) {
    int ch2=t.charAt(i);
    sumT+=ch2;
  }

  return (char)(sumT-sumS);

  }

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String s,t;
    char c;
    System.out.println("enter string S: ");
    s=in.nextLine();
    System.out.println("enter string T: ");
    t=in.nextLine();
    c=getDifference(s,t);
    System.out.println(c);
  }
}
