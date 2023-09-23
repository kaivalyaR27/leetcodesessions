import java.util.*;
import java.lang.*;
public class HappyNumber{
    public static boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = calculateSumOfSquares(n);
        }
        return n == 1;
    }

    private static int calculateSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (isHappy(num)) {
            System.out.println(num + " is a happy number.");
        } else {
            System.out.println(num + " is not a happy number.");
        }
    }
}
