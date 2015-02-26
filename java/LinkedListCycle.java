package javaexamples.leetcode;

import javaexamples.leetcode.model.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by oztokmakc on 04/02/15.
 */
//leetcode - linked list cycle && linked list cycle II
public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {

        Set<ListNode> list = new HashSet<ListNode>();
        ListNode tmp = head;
        while (tmp != null) {
            if (list.contains(tmp)) return true;
            else {
                list.add(tmp);
                tmp = tmp.next;
            }
        }
        return false;
    }

    public static ListNode detectCycle(ListNode head) {

        Set<ListNode> list = new HashSet<ListNode>();
        ListNode tmp = head;
        while (tmp != null) {
            if (list.contains(tmp)) return tmp;
            else {
                list.add(tmp);
                tmp = tmp.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {



    }

}
