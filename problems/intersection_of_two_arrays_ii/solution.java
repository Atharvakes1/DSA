import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l=0;
        if(nums1.length>nums2.length)
        {
            l=nums1.length;
        }
        else
        {
            l=nums2.length;
        }
        int k=0;
        int merge[]=new int[l];
        
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    merge[k]=nums2[j];
                    k++;
                    
                    // 1. Mark this element as "used" so it's not matched again
                    nums2[j] = -1; 
                    
                    // 2. Break the inner loop since nums1[i] found its match
                    break; 
                }
            }
        }
        
        // 3. Trim the array to return only the 'k' elements that were actually filled
        return Arrays.copyOf(merge, k);
    }
}