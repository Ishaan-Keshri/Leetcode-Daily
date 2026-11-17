class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int max=-1;
        int min=101;
        for(int i=0;i<nums.length;i++)
        {
            if(prime(nums[i])==true){
                max=Math.max(i,max);
                min=Math.min(i,min);
            }
        }
        return max-min;
    }
    private boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}