package ru.chernov.linkedlist.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.linkedlist.easy.PalindromeLinkedList;
import ru.chernov.algthms.linkedlist.easy.model.ListNode;

class PalindromeLinkedListTest {

    private final PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    @Test
    void test() {
        var head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))));

        boolean result = palindromeLinkedList.isPalindrome(head);

        Assertions.assertTrue(result);
    }
}
