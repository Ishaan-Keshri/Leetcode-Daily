class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max[]=new int[n];
        int min[]=new int[n];
        int m=nums[0],mi=nums[n-1];
        int i,j;
        for( i=0,j=n-1;i<n;i++,j--)
        {
            m=Math.max(m,nums[i]);
            max[i]=m;
            mi=Math.min(mi,nums[j]);
            min[j]=mi;
        }
        for(i=0;i<n;i++)
        {
            if(max[i]-min[i]<=k)
            {
                return i;
            }
        }
        return -1;
    }
}