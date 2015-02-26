package leetcode.java;

import leetcode.java.model.ListNode;

//leetcode - add two numbers
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int i = 0;
        long num1 = 0, num2 = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                num1 += l1.val * Math.pow(10, i);
                l1 = l1.next;
            }
            if (l2 != null) {
                num2 += l2.val * Math.pow(10, i);
                l2 = l2.next;
            }
            i++;
        }

        long result = num1 + num2;

        int digits = (int) Math.log10(result) + 1;

        ListNode head = new ListNode((int)(result % 10));
        result /= 10;

        ListNode tmp = head;
        for (int j = 2; j <= digits; j++) {
            tmp.next = new ListNode((int)(result % 10));
            result /= 10;
            tmp = tmp.next;
        }

        return head;

    }

    public static void main(String[] args) {

        ListNode l1 = ListNode.construct(9);
        ListNode l2 = ListNode.construct(1, 9, 9, 9, 9, 9, 9, 9, 9, 9);

        System.out.println(ListNode.print(addTwoNumbers(l1, l2)));

    }

}
