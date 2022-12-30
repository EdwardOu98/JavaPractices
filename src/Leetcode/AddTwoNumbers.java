package Leetcode;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please Enter a 3-digit number: ");
        ListNode tmp = l1;
        for(int i = 0; i < 3; ++i) {
            tmp.next = new ListNode(userInput.nextInt());
            tmp = tmp.next;
        }

        System.out.println("Please Enter a 3-digit number: ");
        tmp = l2;
        for(int i = 0; i < 3; ++i) {
            tmp.next = new ListNode(userInput.nextInt());
            tmp = tmp.next;
        }

        ListNode res = addTwoNumbers(l1.next, l2.next);

        while (l1 != null) {
            System.out.print(l1.val);
            l1 = l1.next;
        }

        System.out.print(" + ");

        while(l2 != null) {
            System.out.print(l2.val);
            l2 = l2.next;
        }

        System.out.print(" = ");

        while (res != null) {
            System.out.print(res.val);
            res = res.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();

        int sum;
        int carry = 0;

        ListNode tmp = head;

        while(l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum %= 10;

            tmp.next = new ListNode(sum);
            tmp = tmp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null) {
            sum = l1.val + carry;
            carry = sum / 10;
            sum %= 10;

            tmp.next = new ListNode(sum);
            tmp = tmp.next;
            l1 = l1.next;
        }

        while(l2 != null) {
            sum = l2.val + carry;
            carry = sum / 10;
            sum %= 10;

            tmp.next = new ListNode(sum);
            tmp = tmp.next;
            l2 = l2.next;
        }

        if(carry > 0) {
            tmp.next = new ListNode(carry);
        }

        return head.next;
    }
}
