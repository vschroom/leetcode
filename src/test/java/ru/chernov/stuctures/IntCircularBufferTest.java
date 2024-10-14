package ru.chernov.stuctures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.stuctures.buffer.IntCircularBuffer;

class IntCircularBufferTest {

    @Test
    void test() {
        IntCircularBuffer buffer = new IntCircularBuffer(5);
        for (int i = 1; i <= 100; i++) {
            buffer.add(i);
        }

        Assertions.assertEquals(100, buffer.get(4));
    }
}
