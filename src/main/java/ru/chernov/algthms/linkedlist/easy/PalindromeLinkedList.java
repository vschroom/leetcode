package ru.chernov.algthms.linkedlist.easy;

import ru.chernov.algthms.linkedlist.easy.model.ListNode;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode reverse;
        ListNode cp = head;
        if (head != null) {
            reverse = new ListNode(head.val);
        } else {
            return false;
        }

        while (head.next != null) {
            reverse = new ListNode(head.next.val, reverse);
            head = head.next;
        }

        while (cp != null) {
            if (cp.val != reverse.val) {
                return false;
            }
            cp = cp.next;
            reverse = reverse.next;
        }

        return true;
    }
}
