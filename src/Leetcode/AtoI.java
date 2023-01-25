package Leetcode;
import java.util.*;

public class AtoI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter A String of Number: ");
        String s = input.nextLine();
        int res = myAtoi(s);
    }

    private static int myAtoi(String s) {
        int res = 0;
        int base = Integer.MAX_VALUE / 10, rem = Integer.MAX_VALUE % 10;
        s = s.trim();

        char[] chs = s.toCharArray();

        if((!Character.isDigit(chs[0])) && (chs[0] != '+') && (chs[0] != '-')) {
            return res;
        }

        return res;
    }
}
