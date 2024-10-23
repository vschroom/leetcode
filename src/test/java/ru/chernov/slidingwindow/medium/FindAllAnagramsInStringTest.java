package ru.chernov.slidingwindow.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.slidingwindow.medium.FindAllAnagramsInString;

import java.util.List;

class FindAllAnagramsInStringTest {

    private final FindAllAnagramsInString findAllAnagramsInString = new FindAllAnagramsInString();

    @Test
    void test() {
        var result = findAllAnagramsInString.findAnagrams("cbaebabacd", "abc");

        Assertions.assertEquals(List.of(0, 6), result);
    }
}
