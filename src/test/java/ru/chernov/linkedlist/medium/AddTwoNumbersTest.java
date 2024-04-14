package ru.chernov.linkedlist.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.linkedlist.medium.AddTwoNumbers;
import ru.chernov.algthms.linkedlist.medium.AddTwoNumbers.ListNode;

class AddTwoNumbersTest {

    private final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void test() {
        var l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        var l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        var result = addTwoNumbers.addTwoNumbers(l1, l2);

        Assertions.assertEquals(new ListNode(7, new ListNode(0, new ListNode(8))), result);
    }
}
