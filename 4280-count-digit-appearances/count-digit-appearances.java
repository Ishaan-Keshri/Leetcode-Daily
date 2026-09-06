class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            cnt+=count(nums[i],digit);
        }
        return cnt;
    }
    private int count(int n,int d)
    {
        int c=0;
        while(n!=0)
        {
            if(n%10==d) c++;
            n/=10;
        }
        return c;
    }
}