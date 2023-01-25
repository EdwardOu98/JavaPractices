package Leetcode;
import java.util.*;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println("Please enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int maxLen = 0;

        int start = 0, end = 0;

        for(int i = 0; i < s.length(); ++i) {
            maxLen = Math.max(expandFromCenter(s, i, i+1), expandFromCenter(s, i, i));

            if(maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        System.out.println("start: " + start);
        System.out.println("end: " + end);

        System.out.println("The maximum length of palindromic substring is " + maxLen);
        System.out.println("The substring is: " + s.substring(start, end+1));
    }

    private static int expandFromCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }

        return right - left - 1;
    }
}
