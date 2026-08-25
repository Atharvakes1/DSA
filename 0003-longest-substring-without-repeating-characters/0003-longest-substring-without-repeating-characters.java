class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] cache = new int[128];
        int maxLen = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            left = Math.max(left, cache[r]);
            maxLen = Math.max(maxLen, right - left + 1);
            cache[r] = right + 1;
        }
        
        return maxLen;
    }
}

