import java.util.*;
public class is_subsequence {
  public static boolean isSubsequence(String s, String t) {
    int i = 0; // Pointer for string s
    int j = 0; // Pointer for string t
    
    while (i < s.length() && j < t.length()) {
        if (s.charAt(i) == t.charAt(j)) {
            i++; // Move pointer of s to the next character
        }
        j++; // Always move pointer of t to the next character
    }
    
    // If pointer for s has reached the end, s is a subsequence of t
    return i == s.length();
}
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String s,t;
    boolean b;
    System.out.println("enter string T: ");
    t=in.nextLine();
    System.out.println("enter string S: ");
    s=in.nextLine();
    b=isSubsequence(s,t);
    System.out.println(b);
  }
}
