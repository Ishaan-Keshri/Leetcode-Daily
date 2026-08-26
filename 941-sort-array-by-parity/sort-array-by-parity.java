class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int e=0,o=n-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                ans[e]=nums[i];
                e++;
            }
            else{
                ans[o]=nums[i];
                o--;
            }
        }
        return ans;
    }
}