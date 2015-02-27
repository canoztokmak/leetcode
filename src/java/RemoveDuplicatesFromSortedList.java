package java;

import java.model.ListNode;

// leetcode - remove duplicates from sorted list
public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {

            while (node.val == node.next.val) {
                node.next = node.next.next;
                if(node.next == null) break;
            }
            node = node.next;

        }
        return head;
    }

    public static void main(String[] args) {

        System.out.println(ListNode.print(deleteDuplicates(ListNode.construct(1,1,2,3,4,4,4,5))));

    }

}
