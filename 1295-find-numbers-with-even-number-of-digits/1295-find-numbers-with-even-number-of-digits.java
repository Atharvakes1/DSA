class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int c = 0; // Reset the digit count for every new number
            
            // Use nums[i] instead of the index i
            for (int j = nums[i]; j != 0; j = j / 10) {
                c++;
            }
            
            // Check if the digit count is even
            if (c % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }
}