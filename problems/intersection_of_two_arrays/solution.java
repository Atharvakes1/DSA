import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int x = 0;
        if (nums1.length > nums2.length) {
            x = nums1.length;
        } else {
            x = nums2.length;
        }
        
        int k = 0;
        int merge[] = new int[x];
        
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                
                // Step 1: Found a common element!
                if (nums1[i] == nums2[j]) {
                    
                    // Step 2: Check if we already put it in our result array
                    boolean isDuplicate = false; 
                    for (int m = 0; m < k; m++) {
                        if (merge[m] == nums1[i]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    
                    // Step 3: If it's a new element, save it
                    if (!isDuplicate) {
                        merge[k] = nums1[i];
                        k++;
                    }
                    
                    // Optimization: We found a match for nums1[i], 
                    // no need to keep checking the rest of nums2.
                    break; 
                }
            }
        }
        
        return Arrays.copyOf(merge, k);
    }
}