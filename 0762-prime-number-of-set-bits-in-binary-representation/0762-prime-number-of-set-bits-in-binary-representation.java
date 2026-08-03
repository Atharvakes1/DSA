class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        
        // The maximum number of bits for a 32-bit integer is 32.
        // We can pre-define a boolean array for prime numbers up to 32
        // for O(1) lookups.
        boolean[] isPrime = new boolean[33];
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        for (int p : primes) {
            isPrime[p] = true;
        }
        
        // Iterate through the inclusive range [left, right]
        for (int i = left; i <= right; i++) {
            // Integer.bitCount() efficiently counts the number of set bits (1s)
            int setBits = Integer.bitCount(i);
            
            // If the number of set bits is a prime number, increment our counter
            if (isPrime[setBits]) {
                count++;
            }
        }
        
        return count;
    }
}