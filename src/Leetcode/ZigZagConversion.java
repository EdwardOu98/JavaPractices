package Leetcode;
import java.util.*;

public class ZigZagConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a String: ");
        String s = input.nextLine();
        System.out.println("Please Enter an Integer: ");
        int numRows = input.nextInt();
        String res = convert(s, numRows);

        System.out.println("The new string is: " + res);
    }

    private static String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        String[] newS = new String[numRows];
        int step = -1, idx = 0;
        int i = 0;

        for(; i < numRows; ++i) {
            newS[i] = "";
        }

        i = 0;
        while(i < s.length()) {
            newS[idx] += s.charAt(i);
            if(idx == 0) {
                step = 1;
            } else if (idx == numRows - 1) {
                step = -1;
            }
            idx += step;
            ++i;
        }

        String ret = "";

        for(i = 0; i < numRows; ++i) {
            ret += newS[i];
        }
        return ret;
    }
}
