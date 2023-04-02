package ru.chernov.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayIITest {
    private final RemoveDuplicatesFromSortedArrayII removeDuplicatesFromSortedArrayII =
            new RemoveDuplicatesFromSortedArrayII();

    @Test
    void test1() {
        int[] nums = new int[] {1,1,1,2,2,3};
        int[] expectedNums = new int[] {1,1,2,2,3};
        int k = removeDuplicatesFromSortedArrayII.removeDuplicates(nums);

        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void test2() {
        int[] nums = new int[] {0,0,1,1,1,1,2,3,3};
        int[] expectedNums = new int[] {0,0,1,1,2,3,3};
        int k = removeDuplicatesFromSortedArrayII.removeDuplicates(nums);

        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void test3() {
        int[] nums = new int[] {1,1,1,2,2,3};
        int[] expectedNums = new int[] {1,1,2,2,3};
        int k = removeDuplicatesFromSortedArrayII.removeDuplicates2(nums);

        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void test4() {
        int[] nums = new int[] {0,0,1,1,1,1,2,3,3};
        int[] expectedNums = new int[] {0,0,1,1,2,3,3};
        int k = removeDuplicatesFromSortedArrayII.removeDuplicates2(nums);

        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}
