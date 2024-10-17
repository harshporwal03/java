import java.util.Scanner;
import java.util.Stack;
public class nextGreaterElement {
  public static int[] getNextGreaterElements(int[] arr)
  {
    Stack<Integer> st = new Stack<>();
    int[] a = new int[arr.length];
    a[arr.length-1] = -1;
    st.push(arr[arr.length-1]);
    for(int i = arr.length-2; i >= 0; i--)
    {
      while(st.size()>0 && st.peek()<arr[i])
      {
        st.pop();
      }
      if(st.size()==0) 
        a[i]=-1;
      else
        a[i] = st.peek();

      st.push(arr[i]);
    }
    return a;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = in.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the array: ");
    for (int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
    }

    int[] res = getNextGreaterElements(arr);
    System.out.println("Next Greater Elements: ");
    for (int i = 0; i < res.length; i++) {
        System.out.print(res[i] + " ");
    }
  }
  
}
