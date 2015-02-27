package java;

import java.model.ListNode;

//leetcode - merge two sorted lists
public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        else if (l2 == null) return l1;

        ListNode head = null, temp = null;
        if (l1.val > l2.val) {
            head = l2;
            l2 = l2.next;
        } else {
            head = l1;
            l1 = l1.next;
        }

        temp = head;
        while (l1 != null && l2 != null) {

            if (l1.val > l2.val) {
                temp.next = l2;
                l2 = l2.next;
            } else {
                temp.next = l1;
                l1 = l1.next;
            }
            temp = temp.next;

        }

        if (l1 == null) {
            temp.next = l2;
        } else {
            temp.next = l1;
        }

        return head;

    }

    public static void main(String[] args) {

        ListNode l1 = ListNode.construct(1, 3, 5);
//        ListNode l1 = null;
        ListNode l2 = ListNode.construct(2, 4, 6);
//        ListNode l2 = null;

        System.out.println(ListNode.print(mergeTwoLists(l1, l2)));

    }

}
