package ru.chernov.binarysearch.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.binarysearch.easy.FindSmallestLetterGreaterThanTarget;

class FindSmallestLetterGreaterThanTargetTest {

    private final FindSmallestLetterGreaterThanTarget smallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();

    @Test
    void test() {
        char[] l = {'x','x','y','y'};
        char t = 'z';

        char res = smallestLetterGreaterThanTarget.nextGreatestLetter(l, t);

        Assertions.assertEquals('x', res);
    }
}
