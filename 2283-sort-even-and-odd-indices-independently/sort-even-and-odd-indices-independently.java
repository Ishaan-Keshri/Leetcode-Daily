class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int odd[]=new int[n/2];
        int even[]=new int[(n + 1) / 2];
        int o=0,e=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                even[e]=nums[i];
                e++;
            }
            else
            {
                odd[o]=nums[i];
                o++;
            }
        }
        Arrays.sort(odd);
        Arrays.sort(even);
        int ans[]=new int[n];
        e=0;
        o=odd.length-1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                ans[i]=even[e++];
            }
            else
            {
                ans[i]=odd[o--];
            }
        }
        return ans;
    }
}