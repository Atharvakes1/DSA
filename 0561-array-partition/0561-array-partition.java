import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        int sum = 0;
        // Add every element at an even index (the minimum of each sorted pair)
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        
        return sum;
    }
}