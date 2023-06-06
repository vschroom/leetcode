package ru.chernov.algorythms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GraphAndQueueTest {

    private final GraphAndQueue graphAndQueue = new GraphAndQueue();

    @Test
    void test() {
        var seller = graphAndQueue.findSellerFor("Sam");

        assertEquals("Alexander", seller);
    }
}
