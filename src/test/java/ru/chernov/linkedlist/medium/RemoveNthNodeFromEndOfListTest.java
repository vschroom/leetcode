package ru.chernov.linkedlist.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.linkedlist.easy.model.ListNode;
import ru.chernov.algthms.linkedlist.medium.RemoveNthNodeFromEndOfList;

class RemoveNthNodeFromEndOfListTest {

    private final RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

    @Test
    void test() {
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        var expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5, null))));

        var result = removeNthNodeFromEndOfList.removeNthFromEnd(head, 2);

        Assertions.assertEquals(expected, result);
    }
}
