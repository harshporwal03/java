import java.util.*;

public class reverse_vowels {
    public static String reverseVowels(String s) {
        char c[] = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && c[left] != 'a' && c[left] != 'e' && c[left] != 'i' && c[left] != 'o'
                    && c[left] != 'u') // or we can use (left < right && !isVowel(chars[right]))
            {
                left++;
            }
            while (left < right && c[right] != 'a' && c[right] != 'e' && c[right] != 'i' && c[right] != 'o'
                    && c[right] != 'u') {
                right--;
            }
            if (left < right) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;

                left++;
                right--;
            }
        }
        return new String(c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(reverseVowels(s));
    }
}

/*
 * public static String reverseVowels(String s) {
 * s = s.toLowerCase();
 * int l = s.length();
 * for (int i = 0; i < l; i++) {
 * char c = s.charAt(i);
 * if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
 * s.charAt(i) == 'o'
 * || s.charAt(i) == 'u') {
 * for (int j = l - 1; j >= 0; j--) {
 * char ch = s.charAt(j);
 * if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' ||
 * s.charAt(j) == 'o'
 * || s.charAt(j) == 'u') {
 * char temp = ch;
 * ch = c;
 * c = temp;
 * }
 * }
 * }
 * }
 * return s;
 * }
 */