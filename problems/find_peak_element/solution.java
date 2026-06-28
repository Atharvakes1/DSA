class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // If mid element is less than its right neighbor, 
            // then a peak must be on the right side.
            if (nums[mid] < nums[nums.length - 1 == mid ? mid : mid + 1]) { 
                // A simpler comparison since mid < high, nums[mid+1] is always safe:
                // if (nums[mid] < nums[mid + 1])
                low = mid + 1;
            } else {
                // Otherwise, the peak is on the left side (including mid)
                high = mid;
            }
        }
        
        // low and high will converge to the peak element's index
        return low;
    }
}
