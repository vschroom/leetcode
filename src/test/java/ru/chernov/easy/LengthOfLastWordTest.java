package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordTest {

    private final LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    void test() {
        var result = lengthOfLastWord.lengthOfLastWord("Hello World");

        assertEquals(5, result);
    }

    @Test
    void test2() {
        var result = lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ");

        assertEquals(4, result);
    }

    @Test
    void test3() {
        var result = lengthOfLastWord.lengthOfLastWord("luffy is still joyboy");

        assertEquals(6, result);
    }

    @Test
    void test4() {
        var result = lengthOfLastWord.lengthOfLastWord2("Hello World");

        assertEquals(5, result);
    }

    @Test
    void test5() {
        var result = lengthOfLastWord.lengthOfLastWord2("   fly me   to   the moon  ");

        assertEquals(4, result);
    }

    @Test
    void test6() {
        var result = lengthOfLastWord.lengthOfLastWord2("luffy is still joyboy");

        assertEquals(6, result);
    }
}
