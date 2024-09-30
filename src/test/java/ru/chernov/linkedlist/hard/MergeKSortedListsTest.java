package ru.chernov.linkedlist.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.linkedlist.hard.MergeKSortedLists;
import ru.chernov.algthms.linkedlist.hard.MergeKSortedLists.ListNode;

class MergeKSortedListsTest {

    private final MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();

    @Test
    void test1() {
        var listNode1 = new ListNode(1, new ListNode(4, new ListNode(5, null)));
        var listNode2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        var listNode3 = new ListNode(2, new ListNode(6, null));
        ListNode[] lists = {listNode1, listNode2, listNode3};
        var expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6, null))))))));

        var result = mergeKSortedLists.mergeKLists(lists);

        Assertions.assertEquals(expected, result);
    }
}
