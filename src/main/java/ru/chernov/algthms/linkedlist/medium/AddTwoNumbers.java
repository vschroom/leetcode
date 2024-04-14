package ru.chernov.algthms.linkedlist.medium;

import java.util.Objects;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var first = l1;
        var second = l2;
        var res = new ListNode();
        var temp = res;
        var count = 0;
        while (first != null || second != null) {
            int d;
            if (first != null && second != null) {
                d = first.val + second.val;
            } else if (first != null) {
                d = first.val;
            } else {
                d = second.val;
            }
            int target = (d + count);
            temp.val = target % 10;

            if (count != 0) {
                count--;
            }
            int diff = target / 10;
            if (diff > 0) {
                count++;
            }

            if ((first != null && first.next != null) || (second != null && second.next != null)) {
                temp.next = new ListNode();
            } else {
                if (count != 0) {
                    temp.next = new ListNode(count);
                }
            }
            temp = temp.next;

            if (first != null && second != null) {
                first = first.next;
                second = second.next;
            } else if (first != null) {
                first = first.next;
            } else {
                second = second.next;
            }

        }
        return res;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

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
