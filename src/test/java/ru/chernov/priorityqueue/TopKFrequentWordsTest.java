package ru.chernov.priorityqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.priorityqueue.TopKFrequentWords;

import java.util.List;

class TopKFrequentWordsTest {

    private final TopKFrequentWords topKFrequentWords = new TopKFrequentWords();

    @Test
    void test() {
        var result = topKFrequentWords.topKFrequent(
                new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4);

        Assertions.assertEquals(List.of("the", "is", "sunny", "day"), result);
    }
}
