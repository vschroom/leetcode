package ru.chernov.slidingwindow.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.slidingwindow.easy.ContainsDuplicatesTwo;

class ContainsDuplicatesTwoTest {

    private final ContainsDuplicatesTwo containsDuplicatesTwo = new ContainsDuplicatesTwo();

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean expected = true;

        boolean result = containsDuplicatesTwo.containsNearbyDuplicate(nums, k);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void test2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        boolean expected = true;

        boolean result = containsDuplicatesTwo.containsNearbyDuplicate(nums, k);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void test3() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean expected = false;

        boolean result = containsDuplicatesTwo.containsNearbyDuplicate(nums, k);

        Assertions.assertEquals(expected, result);
    }
}
