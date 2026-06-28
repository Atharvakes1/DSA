class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Iterate through each element
        for (int i = 0; i < nums.length; i++) {
            // Check every element that comes after 'i'
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // Return an empty array if no solution is found (though the problem guarantees one)
        return new int[] {};
    }
}