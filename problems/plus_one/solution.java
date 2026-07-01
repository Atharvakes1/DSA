class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        
        // 1. Just add 1 to the very last digit
        digits[len - 1] = digits[len - 1] + 1;
        
        // 2. If it didn't become 10, we are already done!
        if (digits[len - 1] < 10) {
            return digits;
        }
        
        // 3. If it did become 10 and it's a single digit (like [9]), make it [1, 0]
        if (len == 1 && digits[0] == 10) {
            return new int[]{1, 0};
        }
        
        // Otherwise, use the standard backward check for carries
        for (int i = len - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1]++;
            }
        }
        
        // If the very first digit became 10 (like [9, 9] -> [10, 0])
        if (digits[0] == 10) {
            int[] newDigits = new int[len + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        
        return digits;
    }
}