import java.util.*;

public class canbeconstructed {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int len1 = ransomNote.length();
        int len2 = magazine.length();
        int c = 0;
        if (len1 > len2) {
            return false;
        }

        for (int i = 0; i < len1; i++) {
            char currentChar = ransomNote.charAt(i);
            boolean found = false;
            for (int j = 0; j < len2; j++) {
                if (currentChar == magazine.charAt(j)) {
                    c += 1;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false; // Character not available in magazine
            }
        }

        if (c == len1) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String s1 = in.nextLine();
        System.out.println("Enter the 2nd String");
        String s2 = in.nextLine();
        boolean result = canConstruct(s1, s2);
        System.out.println("Ransom Note can be constructed: " + result);
    }
}