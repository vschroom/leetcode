package ru.chernov.linkedlist.easy;

import org.junit.jupiter.api.Test;
import ru.chernov.algthms.linkedlist.easy.MergeTwoSortedLists;
import ru.chernov.algthms.linkedlist.easy.model.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    void test() {
        var list1 = listNode(1, listNode(3, listNode(5, listNode(8, null))));
        var list2 = listNode(2, listNode(3, listNode(4, listNode(10, null))));

        var result = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(5, result.next.next.next.next.next.val);
        assertEquals(8, result.next.next.next.next.next.next.val);
        assertEquals(10, result.next.next.next.next.next.next.next.val);
    }

    @Test
    void test2() {
        var list1 = listNode(2);
        var list2 = listNode(1);

        var result = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
    }

    @Test
    void test3() {
        var list1 = listNode(1, listNode(3, listNode(5, listNode(8, null))));
        var list2 = listNode(6);

        var result = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(1, result.val);
        assertEquals(3, result.next.val);
        assertEquals(5, result.next.next.val);
        assertEquals(6, result.next.next.next.val);
        assertEquals(8, result.next.next.next.next.val);
    }

    @Test
    void test4() {
        var list1 = listNode(1, listNode(3, listNode(5, listNode(8, null))));
        var list2 = listNode(2, listNode(3, listNode(4, listNode(10, null))));

        var result = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(5, result.next.next.next.next.next.val);
        assertEquals(8, result.next.next.next.next.next.next.val);
        assertEquals(10, result.next.next.next.next.next.next.next.val);
    }

    @Test
    void test5() {
        var list1 = listNode(2);
        var list2 = listNode(1);

        var result = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
    }

    @Test
    void test6() {
        var list1 = listNode(1, listNode(3, listNode(5, listNode(8, null))));
        var list2 = listNode(6);

        var result = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(1, result.val);
        assertEquals(3, result.next.val);
        assertEquals(5, result.next.next.val);
        assertEquals(6, result.next.next.next.val);
        assertEquals(8, result.next.next.next.next.val);
    }

    private ListNode listNode(int val, ListNode next) {
        return new ListNode(val, next);
    }

    private ListNode listNode(int val) {
        return new ListNode(val);
    }
}
