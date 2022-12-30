package Leetcode;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 10 numbers: ");
        int[] nums = new int[10];

        for(int i = 0; i < 10; ++i) {
            nums[i] = userInput.nextInt();
        }

        int target;

        System.out.println("Please Enter the target sum: ");
        target = userInput.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < 10; ++i) {
            if(map.containsKey(nums[i])) {
                System.out.println("Indices are: " + map.get(nums[i]) + " " + i);
            }

            map.put(target - nums[i], i);
        }
    }


}
