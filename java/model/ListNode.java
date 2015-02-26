package javaexamples.leetcode.model;

/**
 * Created by oztokmakc on 29/01/15.
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode construct(int... values) {

        ListNode head = new ListNode(values[0]);
        ListNode temp = head;
        for(int i = 1; i < values.length; i++) {
            temp.next = new ListNode(values[i]);
            temp = temp.next;
        }
        return head;

    }

    public static String print(ListNode node) {

        ListNode temp = node;
        StringBuilder sb = new StringBuilder();

        sb.append("{");
        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
            if (temp != null) sb.append(",");
        }
        sb.append("}");

        return sb.toString();

    }
}
