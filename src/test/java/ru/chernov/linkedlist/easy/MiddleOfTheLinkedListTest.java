package ru.chernov.linkedlist.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.linkedlist.easy.MiddleOfTheLinkedList;
import ru.chernov.algthms.linkedlist.easy.model.ListNode;

class MiddleOfTheLinkedListTest {

    private final MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

    @Test
    void test() {
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(5, null)))));
        var expected = new ListNode(3, new ListNode(2, new ListNode(5, null)));

        var result = middleOfTheLinkedList.middleNode(head);

        Assertions.assertEquals(expected, result);
    }
}
