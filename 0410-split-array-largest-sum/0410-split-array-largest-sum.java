class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        
       
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }
        
       
        while (low <= high) {
            int mid = low + (high - low) / 2; 
            int partitions = countPartitions(nums, mid);
            
            if (partitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return low;
    }
    private int countPartitions(int[] nums, int maxSum) {
        int partitions = 1;
        long currentSum = 0;
        
        for (int num : nums) {
            if (currentSum + num <= maxSum) {
                currentSum += num;
            } else {
                partitions += 1;
                currentSum = num;
            }
        }
        
        return partitions;
    }
}