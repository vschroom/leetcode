package ru.chernov.algthms.linkedlist.easy;

import ru.chernov.algthms.linkedlist.easy.model.ListNode;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int t) {
        ListNode prev = null;
        ListNode copy = prev;
        boolean first = true;
        while (head != null) {
            if (head.val == t) {
                if (prev != null) {
                    prev.next = head.next;
                }
            } else {
                prev = head;
            }
            head = head.next;
            if (prev != null && first) {
                copy = prev;
                first = false;
            }
        }

        return copy;
    }
}
