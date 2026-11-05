class Solution {
    public int[] countOppositeParity(int[] nums) {
        int ce=0,co=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                ce++;
            }
            else{
                co++;
            }
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                ans[i]=co;
                ce--;
            }
            else{
                ans[i]=ce;
                co--;
            }
        }
        return ans;
    }
}