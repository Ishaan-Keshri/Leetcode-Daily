class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=k;
        int sum=0;
        for(int i=0;i<k;i++)
        {
           sum+= nums[i];
        }
        int n=nums.length;
        double max=(double)sum/k;
        while(r<n)
        {
            sum=sum-nums[l]+nums[r];
            max=Math.max(max,(double)sum/k);
            l++;
            r++;
        }
        return max;
    }
}