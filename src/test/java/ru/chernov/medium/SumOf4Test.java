package ru.chernov.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SumOf4Test {

    private final SumOf4 sumOf4 = new SumOf4();

    @Test
    void test() {
        var result = sumOf4.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);

        Assertions.assertEquals(List.of(List.of(-2,-1,1,2), List.of(-2,0,0,2), List.of(-1,0,0,1)), result);
    }
}
