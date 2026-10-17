class Solution {
    public int findLucky(int[] arr) {
        int f[]=new int[501];
        for(int i:arr)
        {
            f[i]++;
        }
        int ans=-1;
        for(int i=1;i<501;i++)
        {
            if(f[i]==i)
            {
                ans=i;
            }
        }
        return ans;
    }
}