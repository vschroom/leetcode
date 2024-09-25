package ru.chernov.algthms.linkedlist.easy;

import java.util.Objects;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
 * following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
 * Note that pos is not passed as a parameter.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }

        var fast = head.next.next;
        var slow = head;
        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }

    public static class ListNode {
        int val;
        ListNode next;
        int id;

        public ListNode(int val, ListNode next, int id) {
            this.val = val;
            this.next = next;
            this.id = id;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return id == listNode.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next, id);
        }
    }
}
