package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class a02MergeTwoArraysTest {

    @Test
    void merge() {
        A02MergeTwoArrays a2 = new A02MergeTwoArrays();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        int[] result = new int[]{1, 2, 2, 3, 5, 6};
        a2.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(result, nums1);
    }
}