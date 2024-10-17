import java.util.*;

public class longest_common_prefix {
    public static String longestCommonPrefix(String[] strs) {
        /*
         * String string = "";
         * for (int i = 0; i < strs.length; i++) {
         * for (int j = i + 1; j < strs.length; j++) {
         * String st1 = strs[i];
         * String st2 = strs[j];
         * int k, l;
         * for (k = 0, l = 0; k < st1.length(), st2.length(); k++, l++) {
         * if (st1.charAt(k) == st2.charAt(l)) {
         * string = string + st1.charAt(k);
         * } else {
         * break;
         * }
         * }
         * }
         * }
         * return string;
         */

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // Initialize the prefix with the first string

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Keep removing characters from the prefix until it is a prefix of strs[i]
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = in.nextInt();
        String s[] = new String[n];
        System.out.println("enter string in array");
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
        }
        String ss = longestCommonPrefix(s);
        System.out.println("similar string = " + ss);
    }
}