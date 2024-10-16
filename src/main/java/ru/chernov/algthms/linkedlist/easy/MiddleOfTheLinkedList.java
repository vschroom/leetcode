package ru.chernov.algthms.linkedlist.easy;

import ru.chernov.algthms.linkedlist.easy.model.ListNode;

public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode cp = head;
        while (head != null) {
            len++;
            head = head.next;
        }
        len = len / 2;
        while (len != 0 && cp != null) {
            cp = cp.next;
            len--;
        }

        return cp;
    }
}
