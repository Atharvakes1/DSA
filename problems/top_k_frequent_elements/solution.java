class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] x = new int[nums.length];
        int b = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    // Note: If there are many duplicates, b might exceed nums.length.
                    if (b < x.length) { 
                        x[b] = nums[i];
                        b++;
                    }
                }
            }
        }

        // --- CONTINUATION OF YOUR LOGIC STYLE ---
        
        // 1. Identify unique elements and track their individual frequencies
        int[] uniqueElements = new int[nums.length];
        int[] frequencies = new int[nums.length];
        int uniqueSize = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean alreadyFound = false;
            for (int j = 0; j < uniqueSize; j++) {
                if (uniqueElements[j] == nums[i]) {
                    frequencies[j]++;
                    alreadyFound = true;
                    break;
                }
            }
            if (!alreadyFound) {
                uniqueElements[uniqueSize] = nums[i];
                frequencies[uniqueSize] = 1;
                uniqueSize++;
            }
        }

        // 2. Sort the unique elements by their frequency in descending order (Bubble Sort)
        for (int i = 0; i < uniqueSize - 1; i++) {
            for (int j = 0; j < uniqueSize - i - 1; j++) {
                if (frequencies[j] < frequencies[j + 1]) {
                    // Swap frequencies
                    int tempFreq = frequencies[j];
                    frequencies[j] = frequencies[j + 1];
                    frequencies[j + 1] = tempFreq;
                    
                    // Swap corresponding elements
                    int tempElem = uniqueElements[j];
                    uniqueElements[j] = uniqueElements[j + 1];
                    uniqueElements[j + 1] = tempElem;
                }
            }
        }

        // 3. Extract the top k frequent elements into the final result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = uniqueElements[i];
        }

        return result;
    }
}
