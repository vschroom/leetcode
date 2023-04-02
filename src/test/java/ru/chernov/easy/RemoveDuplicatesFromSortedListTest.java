package ru.chernov.easy;

import org.junit.jupiter.api.Test;
import ru.chernov.easy.RemoveDuplicatesFromSortedList.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedListTest {

    private final RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

    @Test
    void test() {
        var listNode = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))));
        var result = removeDuplicatesFromSortedList.deleteDuplicates(listNode);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
    }
}
