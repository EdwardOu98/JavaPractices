package Leetcode;
import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter an integer: ");
        int x = input.nextInt();

        System.out.println("The reverse of " + x + " is " + reverse(x));
    }

    private static int reverse(int x) {
        int res = 0;
        int posBase = Integer.MAX_VALUE / 10, posRem = Integer.MAX_VALUE % 10;
        int negBase = Integer.MIN_VALUE / 10, negRem = Integer.MIN_VALUE % 10;

        while(x != 0) {
            int temp = x % 10;
            if((res > posBase) || ((res == posBase) && (temp > posRem))) {
                return 0;
            }
            if((res < negBase) || ((res == negBase) && (temp < negRem))) {
                return 0;
            }
            res = res * 10 + temp;
            x /= 10;
        }

        return res;
    }
}
