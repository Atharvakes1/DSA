class Solution {
    public void moveZeroes(int[] nums) {
        int k=nums.length-1;
        int t=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[t]=nums[i];
                t++;
            }
        }
          while (t < nums.length) {
            nums[t] = 0;
            t++;
    }
}
}