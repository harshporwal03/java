import java.util.*;
public class strpalindrome {
 

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
       
        String d=" ";
        
        int l=A.length();
        for(int i=l-1;i>=0;i--)
        {
            char c=A.charAt(i);
            d=d+c;
            
        }
        d=d.trim();
        if(d==A)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        }
    }


