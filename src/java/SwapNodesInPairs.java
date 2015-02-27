package java;

import java.model.ListNode;

//leetcode - swap nodes in pairs
public class SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head) {

        ListNode newHead = head, tmp = head;
        if (head != null && head.next != null) newHead = head.next;

        while (tmp != null && tmp.next != null) {
            ListNode n1 = tmp, n2 = tmp.next;
            n1.next = find2next(n2);
            tmp = n2.next;
            n2.next = n1;
        }

        return newHead;
    }

    private static ListNode find2next(ListNode node) {

        ListNode temp = node.next;
        for (int i = 0; i < 1; i++) {
            if (temp != null && temp.next != null) {
                temp = temp.next;
            }
        }

        return temp;

    }

    public static void main(String[] args) {

        ListNode head = swapPairs(ListNode.construct(1, 2, 3, 4, 5, 6, 7, 8));

        System.out.println(ListNode.print(head));

    }

}
