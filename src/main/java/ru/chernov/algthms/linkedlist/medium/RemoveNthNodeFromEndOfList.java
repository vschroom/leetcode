package ru.chernov.algthms.linkedlist.medium;

import ru.chernov.algthms.linkedlist.easy.model.ListNode;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 1) {
            return null;
        }
        int len = 0;
        var cp = head;
        while (cp.next != null) {
            cp = cp.next;
            len++;
        }

        if (n == 1) {
            var cp2 = head;
            len -= n;
            while (len != 0) {
                head = head.next;
                len--;
            }
            head.next = null;
            return cp2;
        }

        if (len - n < 0) {
            return head.next;
        }

        var cp3 = head;
        len -= n;
        while (len != 0 && head.next != null) {
            head = head.next;
            len--;
        }

        if (head.next != null) {
            head.next = head.next.next;
        }

        return cp3;
    }
}
