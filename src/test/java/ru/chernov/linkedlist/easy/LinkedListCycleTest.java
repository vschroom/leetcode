package ru.chernov.linkedlist.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.linkedlist.easy.LinkedListCycle;
import ru.chernov.algthms.linkedlist.easy.LinkedListCycle.ListNode;

class LinkedListCycleTest {

    private final LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    void test1() {
        var listNode1 = new ListNode(1, null, 1);
        var listNode2 = new ListNode(2, listNode1, 2);

        listNode1.setNext(listNode2);

        boolean result = linkedListCycle.hasCycle(listNode1);

        Assertions.assertTrue(result);
    }
}
