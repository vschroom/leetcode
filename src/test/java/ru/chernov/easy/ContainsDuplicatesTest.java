package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicatesTest {

    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void test() {
        int[] nums = {1, 2, 4, 1};
        boolean result = containsDuplicate.containsDuplicate(nums);

        assertTrue(result);
    }
}
