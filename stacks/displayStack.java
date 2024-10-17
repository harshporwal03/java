import java.util.Scanner;
import java.util.Stack;

public class displayStack {
  public static void displayRec(Stack<Integer> st)
  {
    if(st.size()==0) return;
    int top = st.pop();
    displayRec(st);
    System.out.print(top + " ");
    st.push(top);
  }

  public static void displayReverseRec(Stack<Integer> st)
  {
    if(st.size()==0) return;
    int top = st.pop();
    System.out.print(top + " ");
    displayRec(st);
    st.push(top);
  }
  public static void main(String[] args) {
    java.util.Scanner in = new Scanner(System.in);
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2); 
    st.push(3); 
    st.push(4); 
    st.push(5);
    displayRec(st);
    System.out.println();
    displayReverseRec(st);
    //System.out.println(st);



    // Stack<Integer> rt = new Stack<>();
    // while(st.size()>0)
    // {
    //   rt.push(st.pop());
    // }
    // while(rt.size()>0)
    // {
    //   int x = rt.pop();
    //   System.out.print(x+" ");
    //   st.push(x);
    // }




    // int n = st.size();
    // int[] a = new int[n];
    // for(int i = n-1; i >= 0; i--)
    // {
    //   a[i] = st.pop();
    // }
    // for(int i = 0; i < n;i++)
    // {
    //   System.out.print(a[i]+" ");
    //   st.push(a[i]);
    // }
  }
}
