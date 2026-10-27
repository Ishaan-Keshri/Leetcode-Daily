class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        int n=nums.length;
        // TL
        // int l=0;
        // int r=0;
        // while(l<n)
        // {
        //     while(r<n && nums[r]==0)
        //     {
        //         c++;
        //         r++;
        //     }
        //     l++;
        //     r=l;
        // }
        // return c;
        long cz=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                cz++;
                c+=cz;
            }
            else{
                cz=0;
            }
        }
        return c;
    }
}