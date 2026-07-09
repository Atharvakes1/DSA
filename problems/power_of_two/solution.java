class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean x = false;
        if(n<=0)
            return false;
        
        for (int i = 0; i <= 30; i++) {
            if ((int)Math.pow(2, i) == n) {
                x = true;
                break; // Optional: stop looping early since we found it!
            }
        }
        
        // Instead of the if-statement, just return the value of x directly
        return x; 
    }
}