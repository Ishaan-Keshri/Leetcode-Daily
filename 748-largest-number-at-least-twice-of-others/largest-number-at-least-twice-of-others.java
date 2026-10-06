class Solution {
    public int dominantIndex(int[] nums) {
        int max=0,p=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=max)
            {
                max=nums[i];
                p=i;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(2*nums[i]>max && p!=i)
            {
                return -1;
            }
        }
        return p;
    }
}