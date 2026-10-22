class Solution {
    public int digitFrequencyScore(int n) {
        int f[]=new int[10];
        while(n!=0)
        {
            int d=n%10;
            f[d]++;
            n/=10;
        }
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum+=f[i]*i;
        }
        return sum;
    }
}