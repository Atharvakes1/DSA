import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        int x = nums.length / 2;
        Map<Integer, Integer> counts = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // Update the count for the current number
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            
            // Check immediately if this element has become the majority
            if (counts.get(num) > x) {
                return num;
            }
        }
        
        // The problem guarantees a majority element always exists,
        // so this line is just to satisfy the compiler return statement.
        return -1;
    }
}