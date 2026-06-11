class Solution {
    public static int removeDuplicates(int[] nums) {
        int temp=0;
        int k=0;
        if(nums.length==0)
        {
        return 0;
        }int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]!=nums[i])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
}
}