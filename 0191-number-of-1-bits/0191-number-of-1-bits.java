class Solution {
    public int hammingWeight(int n) {
        int count=0;
          String binaryString = Integer.toBinaryString(n);
        for (int i = 0; i < binaryString.length(); i++) {
            char bit = binaryString.charAt(i);
            if(bit=='1')
            {
                count++;
            }
    }
    return count;
}
}