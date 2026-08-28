class Solution {
    public int[] sortedSquares(int[] nums) {
        int n[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            n[i]=nums[i]*nums[i];
        }
        for(int j=0;j<nums.length-1;j++)
        {
            for(int k=0;k<nums.length-1-j;k++)
            {
                if(n[k]>n[k+1])
                {
                    int temp=n[k];
                    n[k]=n[k+1];
                    n[k+1]=temp;
                }
            }
        }
        return n;
    }
}