class Solution {
    public boolean isPowerOfFour(int n) {
        // 1. n must be greater than 0
        // 2. n must be a power of two: (n & (n - 1)) == 0
        // 3. The single set bit must be at an odd position (1st, 3rd, 5th, etc.)
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}