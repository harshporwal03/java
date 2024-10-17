import java.util.*;

public class add_digit {
    public static int addDigits(int num) {
        if (num <= 9)
            return num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        if (sum <= 9)
            return sum;
        else
            return addDigits(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        int number = addDigits(num);
        System.out.println(number);
    }
}
