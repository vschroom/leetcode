package ru.chernov.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.twopointers.PartitionLabels;

import java.util.List;

class PartitionLabelsTest {

    private final PartitionLabels partitionLabels = new PartitionLabels();

    @Test
    void test() {
        var result = partitionLabels.partitionLabels("ababcbacadefegdehijhklij");

        Assertions.assertEquals(List.of(9, 7, 8), result);
    }
}
