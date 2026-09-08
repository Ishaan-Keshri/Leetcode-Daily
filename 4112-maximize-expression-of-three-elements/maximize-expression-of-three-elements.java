class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max=-101;
        int min=101;
        int smax=-101;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=max)
            {
                smax=max;
                max=nums[i];
            }
            else if(smax<nums[i] && nums[i]<max)
            {
                smax=nums[i];
            }
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        return max+smax-min;
    }
}