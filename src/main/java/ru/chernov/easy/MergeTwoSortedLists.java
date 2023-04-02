package ru.chernov.easy;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        var top = new ListNode();
        top.next = list1;
        ListNode head = null;
        while (top.next != null && list2 != null) {
            if (top.next.val > list2.val) {
                ListNode node = new ListNode(list2.val);
                node.next = top.next;
                top.next = node;
                list2 = list2.next;
                if (head == null) {
                    head = top.next;
                }
            }
            if (head == null) {
                head = top.next;
            }
            top = top.next;
        }
        if (list2 != null) {
            top.next = list2;
        }

        return head;
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        var top = new ListNode();
        var cur = top;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }

        cur.next = list1 == null ? list2 : list1;

        return top.next;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


