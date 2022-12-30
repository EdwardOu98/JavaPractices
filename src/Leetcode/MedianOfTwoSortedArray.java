package Leetcode;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {6, 7, 8};

        System.out.println("The median of the two input arrays is " + findMedian(nums1, nums2));
    }

    private static double findMedian(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        if(n1 < n2) {
            return findMedian(nums2, nums1);
        }

        int low = 0, high = n2 * 2;

        while(low <= high) {
            int mid2 = low + (high - low) / 2;
            int mid1 = n1 + n2 - mid2;

            double l1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[(mid1 - 1) / 2];
            double l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[(mid2 - 1) / 2];
            double r1 = (mid1 == n1 * 2) ? Integer.MAX_VALUE : nums1[mid1 / 2];
            double r2 = (mid2 == n2 * 2) ? Integer.MAX_VALUE : nums2[mid2 / 2];

            if(l1 > r2) {
                low = mid2 + 1;
            }
            else if(l2 > r1) {
                high = mid2 - 1;
            }
            else {
                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
            }
        }

        return -1;
    }
}
