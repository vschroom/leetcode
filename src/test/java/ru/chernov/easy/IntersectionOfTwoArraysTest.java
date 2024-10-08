package ru.chernov.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionOfTwoArraysTest {

    private final IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

    @Test
    void test1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = intersectionOfTwoArrays.intersect(nums1, nums2);

        Assertions.assertArrayEquals(new int[]{2, 2}, res);
    }
}
