class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int  min=101;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]==1 && nums[j]==2)||(nums[i]==2 && nums[j]==1))
                {
                    min=Math.min(min,Math.abs(i-j));
                }
            }
        }
        if(min==101)
        {
            return -1;
        }
        return min;
    }
}