package ru.chernov.algthms.linkedlist.easy;

import ru.chernov.algthms.linkedlist.easy.model.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
}
