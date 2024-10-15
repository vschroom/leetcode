package ru.chernov.algthms.linkedlist.easy;

import ru.chernov.algthms.linkedlist.easy.model.ListNode;

import java.util.ArrayDeque;

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
}
