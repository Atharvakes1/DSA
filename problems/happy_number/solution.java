class Solution {
    public boolean isHappy(int n) {
        // Continue looping until we find a happy number (1) 
        // or hit the known unhappy cycle marker (4)
        while (n != 1 && n != 4) {
            int sq = 0; // Reset sq to 0 for the new value of n
            
            // Your exact loop to split digits and sum their squares
            for (int i = n; i != 0; i = i / 10) {
                int d = i % 10;
                sq += d * d;
            }
            
            n = sq; // Update n with the new sum for the next round
        }
        
        // If the loop ended because n became 1, it's true. If it hit 4, it's false.
        return n == 1;
    }
}