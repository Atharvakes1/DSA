class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        
        // false means prime, true means composite (not prime)
        boolean[] isNotPrime = new boolean[n];
        int count = 0;
        
        // Loop up to sqrt(n) because any composite factor past that would have a smaller companion factor already checked
        for (int i = 2; i * i < n; i++) {
            if (!isNotPrime[i]) {
                // Mark all multiples of i starting from i*i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        
        // Count how many numbers are left marked as prime
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}