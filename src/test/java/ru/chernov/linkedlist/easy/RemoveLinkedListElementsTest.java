package ru.chernov.linkedlist.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.linkedlist.easy.RemoveLinkedListElements;
import ru.chernov.algthms.linkedlist.easy.model.ListNode;

class RemoveLinkedListElementsTest {

    private final RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();

    @Test
    void test() {
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(5, null)))));
        var expected = new ListNode(1, new ListNode(3, new ListNode(5, null)));

        var result = removeLinkedListElements.removeElements(head, 2);

        Assertions.assertEquals(expected, result);
    }
}
