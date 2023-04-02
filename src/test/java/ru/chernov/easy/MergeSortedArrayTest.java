package ru.chernov.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {

    private final MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    void test() {
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[] {2, 5, 6};

        mergeSortedArray.merge(nums1, 3, nums2, 3);

        assertArrayEquals(new int[] {1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void test2() {
        int[] nums1 = new int[] {1};
        int[] nums2 = new int[0];

        mergeSortedArray.merge(nums1, 1, nums2, 0);

        assertArrayEquals(new int[] {1}, nums1);
    }

    @Test
    void test3() {
        int[] nums2 = new int[] {1};
        int[] nums1 = new int[] {0};

        mergeSortedArray.merge(nums1, 0, nums2, 1);

        assertArrayEquals(new int[] {1}, nums1);
    }

    @Test
    void test4() {
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[] {2, 5, 6};

        mergeSortedArray.merge2(nums1, 3, nums2, 3);

        assertArrayEquals(new int[] {1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void test5() {
        int[] nums1 = new int[] {1};
        int[] nums2 = new int[0];

        mergeSortedArray.merge2(nums1, 1, nums2, 0);

        assertArrayEquals(new int[] {1}, nums1);
    }

    @Test
    void test6() {
        int[] nums2 = new int[] {1};
        int[] nums1 = new int[] {0};

        mergeSortedArray.merge2(nums1, 0, nums2, 1);

        assertArrayEquals(new int[] {1}, nums1);
    }
}
