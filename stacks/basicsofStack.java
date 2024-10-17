import java.util.Stack;

public class basicsofStack {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    System.out.println(st);
    System.out.println("size : " + st.size());
    st.push(1);
    st.push(23); 
    st.push(90); 
    st.push(5); 
    st.push(34); 
    System.out.println(st);
    // peek
    System.out.println(st.peek());
    st.pop();
    System.out.println(st);
    System.out.println("size : " + st.size());

  }
}
