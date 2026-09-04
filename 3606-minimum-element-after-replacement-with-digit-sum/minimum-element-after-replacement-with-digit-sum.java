class Solution {
    public int minElement(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int sum=sumDigit(nums[i]);
            if(sum<m)
            {
                m=sum;
            }
        }
        return m;
    }
    private int sumDigit(int n)
    {
        int s=0;
        while(n!=0)
        {
            s+=n%10;
            n/=10;
        }
        return s;
    }
}