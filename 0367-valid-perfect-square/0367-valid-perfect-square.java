class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        if (num == 1) return true; // Handling the edge case for 1
        
        long left = 2;
        long right = num / 2; // A perfect square's root (except 1) is never greater than num/2
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long guessSquare = mid * mid;
            
            if (guessSquare == num) {
                return true;
            } else if (guessSquare > num) {
                right = mid - 1; // Look in the lower half
            } else {
                left = mid + 1;  // Look in the upper half
            }
        }
        
        return false;
    }
}