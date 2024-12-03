package ru.chernov.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.twopointers.medium.ReverseWordsInString;

class ReverseWordsInStringTest {

    private final ReverseWordsInString reverseWordsInString = new ReverseWordsInString();

    @Test
    void test() {
        var result = reverseWordsInString.reverseWords("the sky is blue");

        Assertions.assertEquals("blue is sky the", result);
    }
}
