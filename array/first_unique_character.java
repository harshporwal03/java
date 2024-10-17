import java.util.*;
class first_unique_character
{
  public static int firstUniqChar(String s) {
    int len = s.length();
    int index = -1;
    
    for (int i = 0; i < len; i++) {
        char ch = s.charAt(i);
        int c = 0;
        for (int j = 0; j < len; j++) {
            if (i != j && ch == s.charAt(j)) {
                c++;
                break;
            }
        }
        if (c == 0) {
            index = i;
            break;
        }
    }
    
    return index;
}

    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      String s;
      int index;
      System.out.println("enter string: ");
      s=in.nextLine();
      index=firstUniqChar(s);
      System.out.println(+index);
    }
}