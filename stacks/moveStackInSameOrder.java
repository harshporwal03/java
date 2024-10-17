import java.util.Scanner;
import java.util.Stack;
public class moveStackInSameOrder {
  public static void main(String[] args) {
    java.util.Scanner in = new Scanner(System.in);
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2); 
    st.push(3); 
    st.push(4); 
    st.push(5); 
    // int n;
    // System.out.println("enter no. of elements : ");
    // n=in.nextInt();
    // System.out.println("enter the elements : ");
    // for (int i=0;i<n;i++) {
    //   int x = in.nextInt();
    //   st.push(x);
    // }
    System.out.println(st);


    // reverse order

    Stack<Integer> gt = new Stack<>();
    while(st.size()>0)
    {
      gt.push(st.pop());
    }
    System.out.println(gt);

    Stack<Integer> rt = new Stack<>();
    while (gt.size()>0) 
    {
      rt.push(gt.pop());
    }
    System.out.println(rt);
    System.out.println(st);
  }
}
