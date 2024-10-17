import java.util.*;

public class valid_palindrome {
    public static boolean isValid(String s) {
        s = s.trim();
        s = s.toLowerCase();
        int len = s.length();
        String st = "";
        int a;
        System.out.println(s);
        for (int i = 0; i < len; i++) {
            a = s.charAt(i);
            if (97 <= a && a <= 122) {
                st = st + s.charAt(i);
            } else {
                continue;
            }
        }
        st = st.trim();
        int l = st.length();
        System.out.println(st);
        String str = "";
        for (int i = l - 1; i >= 0; i--) {
            str = str + st.charAt(i);
        }
        if (str.equals(st)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValid(s));
    }
}

// returns true for input : "0P" , it should return false instead