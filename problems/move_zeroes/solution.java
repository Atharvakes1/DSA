class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        
        // Bubble the zeros to the end using your nested loop concept
        for(int i = 0; i < nums.length; i++) 
        {
            // Stop at length - 1 so j + 1 never goes out of bounds
            for(int j = 0; j < nums.length - 1; j++) 
            {
                // If the current element is 0 and the next one is non-zero, swap them
                if(nums[j] == 0 && nums[j+1] != 0) 
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        
        // No need for a merge array or return statement! 
        // LeetCode checks the original 'nums' array after this method finishes.
    }
}