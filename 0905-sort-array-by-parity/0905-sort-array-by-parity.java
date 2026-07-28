class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] b = new int[nums.length];
        int k = 0;
        
        // First pass: collect all even numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                b[k] = nums[i];
                k++;
            }
        }
        
        // Second pass: collect all odd numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                b[k] = nums[i];
                k++;
            }
        }
        
        return b;
    }
}