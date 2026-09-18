class NumArray {
    // Array to store the prefix sums
    private int[] prefixSums;

    public NumArray(int[] nums) {
        // Size is nums.length + 1 to easily handle the left boundary without if-conditions
        prefixSums = new int[nums.length + 1];
        
        // Build the prefix sum array
        for (int i = 0; i < nums.length; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        // The sum from left to right inclusive is the difference between these two prefix sums
        return prefixSums[right + 1] - prefixSums[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
