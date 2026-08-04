import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        
        // Iterate through every number in the inclusive range
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        
        return result;
    }
    
    // Helper method to check if a single number is self-dividing
    private boolean isSelfDividing(int num) {
        int temp = num;
        
        while (temp > 0) {
            int digit = temp % 10;
            
            // Check if the digit is 0 or if it does not divide the original number evenly
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            
            // Move to the next digit
            temp /= 10;
        }
        
        return true;
    }
}