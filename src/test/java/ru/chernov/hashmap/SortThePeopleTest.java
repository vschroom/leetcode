package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.eazy.SortThePeople;

class SortThePeopleTest {

    private final SortThePeople sortThePeople = new SortThePeople();


    @Test
    void test1() {
        var result = sortThePeople.sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170});

        Assertions.assertArrayEquals(new String[]{"Mary", "Emma", "John"}, result);
    }

    @Test
    void test2() {
        var result = sortThePeople.sortPeople2(new String[]{"Alice", "Bob", "Bob"}, new int[]{155, 185, 150});

        Assertions.assertArrayEquals(new String[]{"Bob", "Alice", "Bob"}, result);
    }
}
