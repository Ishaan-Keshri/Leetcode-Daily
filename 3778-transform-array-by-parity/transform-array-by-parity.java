class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int e=0,o=n-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                ans[e]=0;
                e++;
            }
            else{
                ans[o]=1;
                o--;
            }
        }
        return ans;
    }
}