package ru.chernov.linkedlist.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.linkedlist.easy.ReverseLinkedList;
import ru.chernov.algthms.linkedlist.easy.ReverseLinkedList.ListNode;

class ReverseLinkedListTest {

    private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    void test1() {
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        var expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1, null)))));

        var result = reverseLinkedList.reverseList(head);

        Assertions.assertEquals(expected, result);
    }
}
