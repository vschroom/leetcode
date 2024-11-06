package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.JewelsAndStones;

class JewelsAndStonesTest {

    private final JewelsAndStones jewelsAndStones = new JewelsAndStones();

    @Test
    void test() {
        int result = jewelsAndStones.numJewelsInStones("z", "ZZ");

        Assertions.assertEquals(0, result);
    }
}
