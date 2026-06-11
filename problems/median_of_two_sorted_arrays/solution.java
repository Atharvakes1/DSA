import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        int[] merged = new int[l];
        
        for(int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }
        for(int j = 0; j < nums2.length; j++) {
            merged[nums1.length + j] = nums2[j];
        }
        Arrays.sort(merged);
        
        double median = 0;
        if(l % 2 == 0) {
            median = (merged[l / 2] + merged[(l / 2) - 1]) / (2.0);
        } else {
            median = merged[l / 2];
        }
        return median;
    }
}
