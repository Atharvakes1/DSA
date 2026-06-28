import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // 1. Sort the array to easily manage duplicates and use two pointers
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip the same element to avoid duplicate triplets for the first position
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Two pointers initialization
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for the second position
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for the third position
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    // Move both pointers inward
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is too small, move left pointer rightward to get a larger number
                    left++;
                } else {
                    // Sum is too large, move right pointer leftward to get a smaller number
                    right--;
                }
            }
        }
        
        return result;
    }
}
