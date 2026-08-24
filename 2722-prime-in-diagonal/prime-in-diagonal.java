class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || (i+j)==n-1)
                {
                    if(help(nums[i][j])==true)
                    {
                        max=Math.max(nums[i][j],max);
                    }
                }
            }
        }
        return max;
    }
    public boolean help(int m)
    {
        if(m<=1)
        {
            return false;
        }
        int c=0;
        for(int i=1;i*i<=m;i++)
        {
            if(m%i==0)
            {
                c++;
                if((m/i)!=i)
                {
                    c++;
                }
            }
        }
        if(c==2)
        {
            return true;
        }
        return false;
    }
}