class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            xor^=nums[i];
        }
        if(xor!=0)
        {
            return nums.length;
        }
        int max=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if((xor^nums[i])!=0)
            {
                return --max;
            }
        }
        return 0;
    }
}