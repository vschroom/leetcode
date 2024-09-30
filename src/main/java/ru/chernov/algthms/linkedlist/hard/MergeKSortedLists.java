package ru.chernov.algthms.linkedlist.hard;

import java.util.Objects;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0) {
            return null;
        }
        if (len == 1) {
            return lists[0];
        }

        ListNode mergeHead = mergeTwoLists(lists[0], lists[1]);
        for (int r = 2; r < len; r++) {
            mergeHead = mergeTwoLists(mergeHead, lists[r]);
        }

        return mergeHead;
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var head = new ListNode();
        var copyHead = head;
        while (list1 != null || list2 != null) {
            var newNode = new ListNode();
            head.next = newNode;
            head = newNode;

            if (list1 == null) {
                head.val = list2.val;
                list2 = list2.next;
            } else if (list2 == null) {
                head.val = list1.val;
                list1 = list1.next;
            } else if (list1.val <= list2.val) {
                head.val = list1.val;
                list1 = list1.next;
            } else {
                head.val = list2.val;
                list2 = list2.next;
            }
        }

        return copyHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}
