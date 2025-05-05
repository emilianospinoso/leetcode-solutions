package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class A02MergeTwoArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        IntStream.range(0, m).forEach(
                i -> nums1[i + m] = nums2[i]
        );
        Arrays.sort(nums1);


        Arrays.stream(nums1).forEach(
                i -> System.out.println(i + "-")

        );
    }


}
