package ru.chernov.algthms.linkedlist.easy;

import java.util.ArrayDeque;
import java.util.Objects;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseLinkedList {

    ArrayDeque<Integer> store = new ArrayDeque<>();

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        var headCopy = head;

        while (head != null) {
            store.push(head.val);
            head = head.next;
        }

        var result = headCopy;
        while (headCopy != null) {
            headCopy.val = store.pop();
            headCopy = headCopy.next;
        }

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}
