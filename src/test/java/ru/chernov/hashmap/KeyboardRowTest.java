package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.KeyboardRow;

class KeyboardRowTest {

    private final KeyboardRow keyboardRow = new KeyboardRow();

    @Test
    void test() {
        var result = keyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});

        Assertions.assertArrayEquals(new String[]{"Alaska", "Dad"}, result);
    }
}
