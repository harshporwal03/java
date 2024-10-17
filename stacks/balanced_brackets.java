import java.util.Scanner;
import java.util.Stack;
public class balanced_brackets {
  public static boolean isBalanced(String str) 
  {
    Stack<Character> st = new Stack<>();
    int n = str.length();
    for(int i = 0; i < n; i++)
    {
      char ch = str.charAt(i);
      if(ch == '(')
      {
        st.push(ch);
      }
      else
      {
        if(st.size()==0) return false;
        if(st.peek()=='(') st.pop();
      }
    }
    if (st.size()>0) return false;
    else return true;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    System.out.println(isBalanced(str));
  }
}
