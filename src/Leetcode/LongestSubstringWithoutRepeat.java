package Leetcode;
import java.util.*;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s = input.nextLine();

        int res = longestSubstring(s);

        System.out.println("The longest substring in " + s + " without repeating character is " + res);
    }

    private static int longestSubstring(String s) {
        int len = 0;

        int n = s.length();
        int[] counter = new int[256];

        int l = 0, r = 0;

        while(r < n) {
            while (counter[s.charAt(r)] > 0) {
                --counter[s.charAt(l)];
                ++l;
            }
            ++counter[s.charAt(r)];
            ++r;
            len = Math.max(len, r - l);
        }

        return len;
    }
}
