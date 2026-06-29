class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n;
        int[] me = new int[len];
        
        // 1. Copy valid elements from nums1 (only up to index m - 1)
        for (int i = 0; i < m; i++) {
            me[i] = nums1[i];
        }
        
        // 2. Copy elements from nums2 right after nums1's elements
        for (int i = 0; i < n; i++) {
            me[m + i] = nums2[i]; // Fixed index and source array typo
        }
        
        // 3. Bubble Sort the 'me' array (Fixed the bounds to avoid OutOfBoundsException)
        int temp = 0;
        for (int p = 0; p < len; p++) {
            for (int q = 0; q < len - 1; q++) { // Changed to len - 1 so q + 1 doesn't overflow
                if (me[q] > me[q + 1]) {        // Flipped to '>' for non-decreasing order
                    temp = me[q];
                    me[q] = me[q + 1];
                    me[q + 1] = temp;
                }
            }
        }
        
        // 4. Copy the sorted elements back into nums1 so LeetCode can read the output
        for (int i = 0; i < len; i++) {
            nums1[i] = me[i];
        }
    }
}