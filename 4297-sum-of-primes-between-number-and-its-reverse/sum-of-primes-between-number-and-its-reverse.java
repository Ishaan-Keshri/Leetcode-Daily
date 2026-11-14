class Solution {
    public int sumOfPrimesInRange(int n) {
       int r=0;
       for(int i=n;i!=0;i/=10)
       {
        r=(r*10)+i%10;
       } 
       int min=Math.min(n,r);
       int max=Math.max(n,r);
       int sum=0;
       for(int i=min;i<=max;i++)
       {
        if(prime(i)==true)
        {
            sum+=i;
        }
       }
       return sum;
    }
    private boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

}