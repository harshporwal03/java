import java.util.Scanner;
import java.util.Stack;

public class prevGreaterElement {
  public static int[] getPrevGreaterElements(int[] arr)
  {
    Stack<Integer> st = new Stack<>();
    int[] a = new int[arr.length];
    a[0] = -1;
    st.push(arr[0]);
    for(int i = 1; i<arr.length; i++)
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

    int[] res = getPrevGreaterElements(arr);
    System.out.println("Next Greater Elements: ");
    for (int i = 0; i < res.length; i++) {
        System.out.print(res[i] + " ");
    }
  }
  
}

