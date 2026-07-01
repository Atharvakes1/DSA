class Solution {
    public int singleNumber(int[] nums) {
        int []nums1=new int[nums.length];
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    nums1[a]=nums[i];
                    a++;
                }
            }
        }
        for(int k=0;k<nums.length;k++)
        {boolean foundInDuplicates = false;
            for(int p=0;p<nums.length;p++)
            {
            if(nums[k]==nums1[p])
            {
              foundInDuplicates= true;
            break;
            }
        }
        if(!foundInDuplicates)
        {
            return nums[k];
        }
        }
        return 0;
}
}
